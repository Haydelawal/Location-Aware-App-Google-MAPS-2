package com.psdemo.outdoorexplorer.ui.map

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Point
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.*
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.graphics.toColorInt
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.material.snackbar.Snackbar
import com.psdemo.outdoorexplorer.BuildConfig
import com.psdemo.outdoorexplorer.R
import com.psdemo.outdoorexplorer.ui.locations.LocationsFragment
import kotlinx.android.synthetic.main.fragment_maps.*
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions
import kotlin.math.roundToInt
import com.google.maps.android.ktx.utils.contains

class MapsFragment : Fragment() {

    private lateinit var mapViewModel: MapViewModel
    private lateinit var myGoogleMap: GoogleMap
    private lateinit var polyline: Polyline
    private val polygons = arrayListOf<Polygon>()
    private val markers = arrayListOf<Marker>()
    private var drawing = false
    private val drawPoints = arrayListOf<LatLng>()

    private val callback = OnMapReadyCallback { googleMap ->
        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        val sydney = LatLng(37.68, -122.42)
        googleMap.addMarker(MarkerOptions().position(sydney).title("Marker in Changed From Sydney"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(10f))

        myGoogleMap = googleMap

        googleMap.uiSettings.isZoomControlsEnabled = true
        googleMap.uiSettings.isTiltGesturesEnabled = false

        mapViewModel = ViewModelProvider(this).get(MapViewModel::class.java)

        mapViewModel.allLocations.observe(viewLifecycleOwner, Observer {
            for (location in it) {
                val point = LatLng(location.latitude, location.longitude)

               val marker = googleMap.addMarker(MarkerOptions()
                    .position(point)
                    .title(location.title)
                    .snippet("Hours: ${location.hours}")
                    .icon(getBitmapFromVector(
                        R.drawable.ic_star_black_24dp,
                        R.color.colorAccent
                    ))
                    .alpha(.75f)
                )
                marker?.tag = location.locationId

                if (BuildConfig.DEBUG) {
                    googleMap.addCircle(
                        CircleOptions().center(point).radius(location.geofenceRadius.toDouble())
                    )
                }
            }
        })

        googleMap.setOnInfoWindowClickListener {  marker ->
            val action = MapsFragmentDirections.actionNavigationMapToNavigationLocation()
            action.locationId = marker.tag as Int
            val navController = Navigation.findNavController(requireView())
            navController.navigate(action)
        }
        enableMyLocation()
    }

    @SuppressLint("MissingPermission")
    @AfterPermissionGranted(RC_LOCATION)
    private fun enableMyLocation() {



        if (EasyPermissions.hasPermissions(
                requireContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION
            )
        ) {
            myGoogleMap.isMyLocationEnabled = true
        }
        else {
            Snackbar.make(
                requireView(), getString(R.string.map_snackbar),
                Snackbar.LENGTH_INDEFINITE
            )
                .setAction(R.string.ok)
                {
                    EasyPermissions.requestPermissions(
                        this,
                        getString(R.string.map_rationale),
                        RC_LOCATION,
                        android.Manifest.permission.ACCESS_FINE_LOCATION

                    )
                }.show()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_maps, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
//        mapFragment?.getMapAsync(callback)

        mapViewModel = ViewModelProvider(this).get(MapViewModel::class.java)


        mapFragment?.getMapAsync { map ->
            myGoogleMap = map
            configureMap()
        }
        configureCustomDraw()
    }

    private fun configureMap() {
        val bay = LatLng(37.68, -122.42)
        myGoogleMap.moveCamera(CameraUpdateFactory.zoomTo(10f))
        myGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(bay))
        myGoogleMap.uiSettings.isZoomControlsEnabled = true
        myGoogleMap.uiSettings.isTiltGesturesEnabled = false

        loadLocations()
        loadRegions()

        myGoogleMap.setOnInfoWindowClickListener { marker ->
            val action = MapsFragmentDirections.actionNavigationMapToNavigationLocation()
            action.locationId = marker.tag as Int
            val navController = Navigation.findNavController(requireView())
            navController.navigate(action)
        }

        setMapStyle()
        enableMyLocation()
    }


    private fun loadLocations() {
        mapViewModel.allLocations.observe(viewLifecycleOwner, Observer {
            for (location in it) {
                val point = LatLng(location.latitude, location.longitude)
                val marker = myGoogleMap.addMarker(
                    MarkerOptions()
                        .position(point)
                        .title(location.title)
                        .snippet("Hours: ${location.hours}")
                        .icon(
                            getBitmapFromVector(
                                R.drawable.ic_star_black_24dp,
                                R.color.colorAccent
                            )
                        )
                        .alpha(0.75f)
                )
                marker?.tag = location.locationId
                markers.add(marker!!)
            }
        })
    }

    private fun setMapStyle() {
        var style = R.raw.map_style_light
        val mode = resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK
        if (mode == Configuration.UI_MODE_NIGHT_YES) {
            style = R.raw.map_style_dark
        }

        myGoogleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(requireContext(), style))
    }

    private fun loadRegions() {
        for (wrapper in mapViewModel.allRegions) {
            val points = wrapper.points.map { regionPoint  ->
                LatLng(
                    regionPoint.latitude,
                    regionPoint.longitude
                )
            }
            if (points.isNotEmpty()) {
                val polygon = myGoogleMap.addPolygon(
                    PolygonOptions()
                        .addAll(points)
                        .fillColor(wrapper.region.color.toColorInt())
                        .strokeWidth(0f)
                )
                polygon.tag = wrapper.region.id
                polygons.add(polygon)
            }
        }

        mapViewModel.visibleRegionIds.observe(viewLifecycleOwner, Observer {
            polygons.forEach { p ->
                if (p.tag == CUSTOM) {
                    p.isVisible = it.isEmpty()
                } else {
                    p.isVisible = it.contains(p.tag)
                }
            }

            filterLocations()
        })
    }

    private fun filterLocations() {
        markers.forEach { m ->
            m.isVisible =
                polygons.any { p ->
                    p.isVisible && p.contains(m.position)
                }
        }
    }

    private fun configureCustomDraw() {
        mapViewModel.beginCustomDraw.observe(viewLifecycleOwner, Observer {
            if (it) {
                drawing = true
                drawPoints.clear()
                polyline = myGoogleMap.addPolyline(
                    PolylineOptions()
                        .color(
                            ResourcesCompat.getColor(
                                resources,
                                R.color.colorDrawLine,
                                requireContext().theme
                            )
                        )
                )
                polygons.forEach { p -> p.isVisible = false }
                markers.forEach { m -> m.isVisible = false }
            }
        })

        drawWindow.setOnTouchListener { v, event ->
            val x = event.x.roundToInt()
            val y = event.y.roundToInt()
            val screenPoint = Point(x, y)
            val mapPoint = myGoogleMap.projection.fromScreenLocation(screenPoint)

            when (event.action) {
                MotionEvent.ACTION_DOWN,
                MotionEvent.ACTION_MOVE -> {
                    if (drawing) {
                        drawPoints.add(mapPoint)
                        polyline.points = drawPoints
                    }
                }

                MotionEvent.ACTION_UP -> {
                    polyline.remove()
                    val customPolygon = myGoogleMap.addPolygon(
                        PolygonOptions()
                            .addAll(drawPoints)
                            .fillColor(
                                ResourcesCompat.getColor(
                                    resources,
                                    R.color.colorDrawFill,
                                    requireContext().theme
                                )
                            )
                            .strokeWidth(0f)
                    )
                    customPolygon.tag = CUSTOM
                    val customIndex = polygons.indexOfFirst { p -> p.tag == CUSTOM }
                    if (customIndex == -1) {
                        polygons.add(customPolygon)
                    } else {
                        polygons[customIndex] = customPolygon
                    }

                    mapViewModel.toggleVisibleRegion(null)
                    drawing = false
                    mapViewModel.setBeginCustomDraw(false)
                    v.performClick()
                }
            }

            drawing
        }
    }


    private fun getBitmapFromVector(
        @DrawableRes vectorResourceId: Int,
        @ColorRes colorResourceId: Int
    ): BitmapDescriptor {
        val vectorDrawable = resources.getDrawable(vectorResourceId, requireContext().theme)
            ?: return BitmapDescriptorFactory.defaultMarker()

        val bitmap = Bitmap.createBitmap(
            vectorDrawable.intrinsicWidth,
            vectorDrawable.intrinsicHeight,
            Bitmap.Config.ARGB_8888
        )

        val canvas = Canvas(bitmap)
        vectorDrawable.setBounds(0, 0, canvas.width, canvas.height)
        DrawableCompat.setTint(
            vectorDrawable,
            ResourcesCompat.getColor(
                resources,
                colorResourceId, requireContext().theme
            )
        )
        vectorDrawable.draw(canvas)
        return BitmapDescriptorFactory.fromBitmap(bitmap)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_filter -> {
            val action = MapsFragmentDirections.actionNavigationMapToNavigationFilterDialog()
            val navController = Navigation.findNavController(requireView())
            navController.navigate(action)
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.map_menu, menu)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this)
    }

    companion object{
        const val RC_LOCATION = 10
        const val CUSTOM = "custom"
    }
}