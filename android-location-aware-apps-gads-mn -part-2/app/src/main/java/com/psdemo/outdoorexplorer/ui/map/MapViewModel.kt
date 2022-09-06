package com.psdemo.outdoorexplorer.ui.map

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.psdemo.outdoorexplorer.data.*

class MapViewModel(application: Application) : AndroidViewModel(application) {
    private val outdoorRepository: OutdoorRepository
    val visibleRegionIds = MutableLiveData<ArrayList<Int>>()
    val allRegions: List<RegionWithPoints>

    init {
        val outdoorDao = OutdoorRoomDatabase.getInstance(application).outdoorDao()
        outdoorRepository = OutdoorRoomRepository(outdoorDao)
        allRegions = outdoorRepository.getAllRegionsWithPoints()
        visibleRegionIds.value = ArrayList(allRegions.map { r -> r.region.id })
    }

    val allLocations = outdoorRepository.getAllLocations()

    val beginCustomDraw = MutableLiveData<Boolean>(false)

    val selectedRegions: LiveData<List<Pair<Region, Boolean>>> =
        Transformations.switchMap(visibleRegionIds) { ids ->
            val list = arrayListOf<Pair<Region, Boolean>>()
            for (wrapper in allRegions) {
                if (ids.isEmpty()) {
                    list.add(Pair(wrapper.region, false))
                } else {
                    list.add(Pair(wrapper.region, ids.contains(wrapper.region.id)))
                }
            }

            MutableLiveData(list.toList())
        }

    fun toggleVisibleRegion(id: Int?) {
        var currentIds: ArrayList<Int> = visibleRegionIds.value!!
        if (id == null) {
            visibleRegionIds.value = arrayListOf()
        } else {
            when {
                currentIds.isEmpty() -> currentIds = arrayListOf(id)

                currentIds.contains(id) -> currentIds.remove(id)

                !currentIds.contains(id) -> currentIds.add(id)
            }

            visibleRegionIds.value = currentIds
        }
    }

    fun setBeginCustomDraw(status: Boolean) {
        beginCustomDraw.value = status
    }
}