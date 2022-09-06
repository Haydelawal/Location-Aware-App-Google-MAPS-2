package com.psdemo.outdoorexplorer.ui.workout

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.psdemo.outdoorexplorer.data.OutdoorRepository
import com.psdemo.outdoorexplorer.data.OutdoorRoomDatabase
import com.psdemo.outdoorexplorer.data.OutdoorRoomRepository

class WorkoutViewModel(application: Application) : AndroidViewModel(application) {
    private val outdoorRepository: OutdoorRepository

    init {
        val outdoorDao = OutdoorRoomDatabase.getInstance(application).outdoorDao()
        outdoorRepository = OutdoorRoomRepository(outdoorDao)
    }
}