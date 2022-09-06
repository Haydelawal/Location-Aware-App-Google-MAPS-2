package com.psdemo.outdoorexplorer.data

import android.os.AsyncTask
import androidx.lifecycle.LiveData
import com.google.android.gms.location.Geofence
import kotlinx.coroutines.runBlocking

class OutdoorRoomRepository(private val outdoorDao: OutdoorDao) : OutdoorRepository {

    override fun getAllActivities() = outdoorDao.getAllActivities()

    override fun getAllLocations() = outdoorDao.getAllLocations()

    override fun getActivityWithLocations(activityId: Int) =
        outdoorDao.getActivityWithLocations(activityId)

    override fun getLocationById(locationId: Int) =
        GetLocationAsyncTask(outdoorDao).execute(locationId).get()

    override fun getLocationWithActivities(locationId: Int) =
        outdoorDao.getLocationWithActivities(locationId)

    override fun toggleActivityGeofence(id: Int) =
        ToggleAsyncTask(outdoorDao).execute(id).get()

    override fun getAllRegionsWithPoints() = runBlocking { outdoorDao.getAllRegionsWithPoints() }

    override fun insertWorkout(workout: Workout) =
        InsertWorkoutAsyncTask(outdoorDao).execute(workout).get()

    override fun updateWorkout(workout: Workout) =
        UpdateWorkoutAsyncTask(outdoorDao).execute(workout).get()

    override fun insertWorkoutPoint(workoutPoint: WorkoutPoint) =
        InsertWorkoutPointAsyncTask(outdoorDao).execute(workoutPoint).get()

    override fun getAllWorkouts(): LiveData<List<Workout>> = outdoorDao.getAllWorkouts()

    private class GetLocationAsyncTask(val outdoorDao: OutdoorDao) :
        AsyncTask<Int, Unit, Location>() {
        override fun doInBackground(vararg ids: Int?): Location {
            return outdoorDao.getLocationById(ids[0]!!)
        }
    }

    private class ToggleAsyncTask(val outdoorDao: OutdoorDao) :
        AsyncTask<Int, Unit, GeofencingChanges>() {
        override fun doInBackground(vararg ids: Int?): GeofencingChanges {
            val previousLocations = outdoorDao.getLocationsForGeofencing()
            require(outdoorDao.toggleGeofenceEnabled(ids[0]!!) == 1) {
                "Activity not found"
            }
            val newLocations = outdoorDao.getLocationsForGeofencing()

            val removedLocations = previousLocations.subtract(newLocations)
            val addedLocations = newLocations.subtract(previousLocations)

            return GeofencingChanges(
                removedLocations.map { l -> l.locationId.toString() },
                addedLocations.map { l -> createGeofence(l) }
            )
        }

        private fun createGeofence(location: Location): Geofence {
            return Geofence.Builder()
                .setRequestId(location.locationId.toString())
                .setCircularRegion(
                    location.latitude,
                    location.longitude,
                    location.geofenceRadius
                )
                .setTransitionTypes(Geofence.GEOFENCE_TRANSITION_ENTER)
                .setExpirationDuration(Geofence.NEVER_EXPIRE)
                .build()
        }
    }

    private class InsertWorkoutAsyncTask(val outdoorDao: OutdoorDao) :
        AsyncTask<Workout, Unit, Int>() {
        override fun doInBackground(vararg workout: Workout): Int {
            return outdoorDao.insertWorkout(workout[0]).toInt()
        }
    }

    private class InsertWorkoutPointAsyncTask(val outdoorDao: OutdoorDao) :
        AsyncTask<WorkoutPoint, Unit, Unit>() {
        override fun doInBackground(vararg workoutPoint: WorkoutPoint) {
            return outdoorDao.insertWorkoutPoint(workoutPoint[0])
        }
    }

    private class UpdateWorkoutAsyncTask(val outdoorDao: OutdoorDao) :
        AsyncTask<Workout, Unit, Unit>() {
        override fun doInBackground(vararg workout: Workout) {
            return outdoorDao.updateWorkout(workout[0])
        }
    }
}