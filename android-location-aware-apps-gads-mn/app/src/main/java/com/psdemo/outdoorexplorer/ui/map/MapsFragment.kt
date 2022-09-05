package com.psdemo.outdoorexplorer.ui.map

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Canvas
import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.drawable.DrawableCompat
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
import pub.devrel.easypermissions.AfterPermissionGranted
import pub.devrel.easypermissions.EasyPermissions

class MapsFragment : Fragment() {

    private lateinit var mapViewModel: MapViewModel
    private lateinit var myGoogleMap: GoogleMap

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

        mapViewModel = ViewModelProvider(this)
            .get(MapViewModel::class.java)

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
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)


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
    }
}