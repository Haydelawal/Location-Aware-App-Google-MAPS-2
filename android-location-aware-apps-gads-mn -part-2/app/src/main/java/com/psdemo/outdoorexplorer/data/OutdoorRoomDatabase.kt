package com.psdemo.outdoorexplorer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.google.gson.GsonBuilder
import java.io.IOException

@Database(
    entities = [Activity::class, Location::class, ActivityLocationCrossRef::class, Region::class, RegionPoint::class, Workout::class, WorkoutPoint::class],
    version = 1,
    exportSchema = false
)
abstract class OutdoorRoomDatabase : RoomDatabase() {
    abstract fun outdoorDao(): OutdoorDao

    companion object {
        @Volatile
        private var INSTANCE: OutdoorRoomDatabase? = null

        fun getInstance(context: Context): OutdoorRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    OutdoorRoomDatabase::class.java,
                    "outdoor_database.db"
                )
                    .addCallback(object : Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            Thread(Runnable {
                                prepopulateDb(
                                    context,
                                    getInstance(context)
                                )
                            }).start()
                        }
                    })
                    .build()
                INSTANCE = instance
                return instance
            }
        }

        private fun prepopulateDb(context: Context, db: OutdoorRoomDatabase) {
            val gson = GsonBuilder().create()
            var data: String? = null
            try {
                data = context.assets.open("data.json").bufferedReader().use { it.readText() }
            } catch (ioException: IOException) {
                ioException.printStackTrace()
            }

            if (data != null) {
                val records = gson.fromJson(data, DatabaseContents::class.java)
                db.outdoorDao().insertActivities(records.activities)
                db.outdoorDao().insertActivityLocationCrossRefs(records.crossrefs)
                db.outdoorDao().insertLocations(records.locations)
                db.outdoorDao().insertRegions(records.regions)
                db.outdoorDao().insertRegionPoints(records.regionpoints)
            }
        }
    }
}