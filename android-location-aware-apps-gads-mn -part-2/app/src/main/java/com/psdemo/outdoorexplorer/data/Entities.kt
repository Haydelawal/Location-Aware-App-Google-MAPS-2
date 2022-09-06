package com.psdemo.outdoorexplorer.data

import androidx.room.*
import com.google.android.gms.location.Geofence
import com.psdemo.outdoorexplorer.util.distanceToInMiles

@Entity
data class Activity(
    @PrimaryKey val activityId: Int = 0,
    val title: String,
    val icon: String,
    val geofenceEnabled: Boolean
)

@Entity
data class Location(
    @PrimaryKey val locationId: Int = 0,
    val title: String,
    val description: String,
    val hours: String,
    val latitude: Double,
    val longitude: Double,
    val geofenceRadius: Float,
    val placeId: String
) {
    fun getDistanceInMiles(currentLocation: android.location.Location): Float {
        val coordinates = android.location.Location("")
        coordinates.latitude = latitude
        coordinates.longitude = longitude
        return currentLocation.distanceToInMiles(coordinates)
    }
}

@Entity(primaryKeys = ["activityId", "locationId"])
data class ActivityLocationCrossRef(
    val activityId: Int,
    val locationId: Int
)

data class ActivityWithLocations(
    @Embedded val activity: Activity,
    @Relation(
        parentColumn = "activityId",
        entityColumn = "locationId",
        associateBy = Junction(ActivityLocationCrossRef::class)
    )
    val locations: List<Location>
)

data class LocationWithActivities(
    @Embedded val location: Location,
    @Relation(
        parentColumn = "locationId",
        entityColumn = "activityId",
        associateBy = Junction(ActivityLocationCrossRef::class)
    )
    val activities: List<Activity>
)

class GeofencingChanges(val idsToRemove: List<String>, val locationsToAdd: List<Geofence>)

@Entity
data class Region(
    @PrimaryKey val id: Int,
    val title: String,
    val color: String
)

@Entity
data class RegionPoint(
    @PrimaryKey(autoGenerate = true) val regionPointId: Int,
    val latitude: Double,
    val longitude: Double,
    val regionId: Int
)

data class RegionWithPoints(
    @Embedded val region: Region,
    @Relation(
        parentColumn = "id",
        entityColumn = "regionId"
    )
    val points: List<RegionPoint>
)

@Entity
data class Workout(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val timestamp: Long,
    var duration: Long = 0,
    var distance: Double = 0.0
)

@Entity
data class WorkoutPoint(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val workoutId: Int,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double
)

data class WorkoutWithPoints(
    @Embedded val workout: Workout,
    @Relation(
        parentColumn = "id",
        entityColumn = "workoutId"
    )
    val points: List<WorkoutPoint>
)

internal class DatabaseContents(
    val activities: List<Activity>,
    val crossrefs: List<ActivityLocationCrossRef>,
    val locations: List<Location>,
    val regions: List<Region>,
    val regionpoints: List<RegionPoint>
)

enum class EventSubject {
    LocationUpdate
}