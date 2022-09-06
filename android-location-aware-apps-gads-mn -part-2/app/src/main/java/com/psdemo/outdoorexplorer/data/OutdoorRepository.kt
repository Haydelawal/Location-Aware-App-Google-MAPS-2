package com.psdemo.outdoorexplorer.data

import androidx.lifecycle.LiveData

interface OutdoorRepository {
    fun getAllActivities(): LiveData<List<Activity>>

    fun getAllLocations(): LiveData<List<Location>>

    fun getActivityWithLocations(activityId: Int): LiveData<ActivityWithLocations>

    fun getLocationById(locationId: Int): Location

    fun getLocationWithActivities(locationId: Int): LiveData<LocationWithActivities>

    fun toggleActivityGeofence(id: Int): GeofencingChanges

    fun insertWorkout(workout: Workout): Int

    fun insertWorkoutPoint(workoutPoint: WorkoutPoint)

    fun updateWorkout(workout: Workout)

    fun getAllWorkouts(): LiveData<List<Workout>>

    fun getAllRegionsWithPoints(): List<RegionWithPoints>

}