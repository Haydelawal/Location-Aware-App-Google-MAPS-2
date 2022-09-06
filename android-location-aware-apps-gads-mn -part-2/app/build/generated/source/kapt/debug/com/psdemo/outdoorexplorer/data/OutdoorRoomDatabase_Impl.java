package com.psdemo.outdoorexplorer.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OutdoorRoomDatabase_Impl extends OutdoorRoomDatabase {
  private volatile OutdoorDao _outdoorDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Activity` (`activityId` INTEGER NOT NULL, `title` TEXT NOT NULL, `icon` TEXT NOT NULL, `geofenceEnabled` INTEGER NOT NULL, PRIMARY KEY(`activityId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Location` (`locationId` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `hours` TEXT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `geofenceRadius` REAL NOT NULL, `placeId` TEXT NOT NULL, PRIMARY KEY(`locationId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ActivityLocationCrossRef` (`activityId` INTEGER NOT NULL, `locationId` INTEGER NOT NULL, PRIMARY KEY(`activityId`, `locationId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Region` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `color` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RegionPoint` (`regionPointId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `regionId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Workout` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `distance` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `WorkoutPoint` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `workoutId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `latitude` REAL NOT NULL, `longitude` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ad86c2060513934818f2a3a4cd96802b')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Activity`");
        _db.execSQL("DROP TABLE IF EXISTS `Location`");
        _db.execSQL("DROP TABLE IF EXISTS `ActivityLocationCrossRef`");
        _db.execSQL("DROP TABLE IF EXISTS `Region`");
        _db.execSQL("DROP TABLE IF EXISTS `RegionPoint`");
        _db.execSQL("DROP TABLE IF EXISTS `Workout`");
        _db.execSQL("DROP TABLE IF EXISTS `WorkoutPoint`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsActivity = new HashMap<String, TableInfo.Column>(4);
        _columnsActivity.put("activityId", new TableInfo.Column("activityId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivity.put("geofenceEnabled", new TableInfo.Column("geofenceEnabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActivity = new TableInfo("Activity", _columnsActivity, _foreignKeysActivity, _indicesActivity);
        final TableInfo _existingActivity = TableInfo.read(_db, "Activity");
        if (! _infoActivity.equals(_existingActivity)) {
          return new RoomOpenHelper.ValidationResult(false, "Activity(com.psdemo.outdoorexplorer.data.Activity).\n"
                  + " Expected:\n" + _infoActivity + "\n"
                  + " Found:\n" + _existingActivity);
        }
        final HashMap<String, TableInfo.Column> _columnsLocation = new HashMap<String, TableInfo.Column>(8);
        _columnsLocation.put("locationId", new TableInfo.Column("locationId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("hours", new TableInfo.Column("hours", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("geofenceRadius", new TableInfo.Column("geofenceRadius", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocation.put("placeId", new TableInfo.Column("placeId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocation = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocation = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocation = new TableInfo("Location", _columnsLocation, _foreignKeysLocation, _indicesLocation);
        final TableInfo _existingLocation = TableInfo.read(_db, "Location");
        if (! _infoLocation.equals(_existingLocation)) {
          return new RoomOpenHelper.ValidationResult(false, "Location(com.psdemo.outdoorexplorer.data.Location).\n"
                  + " Expected:\n" + _infoLocation + "\n"
                  + " Found:\n" + _existingLocation);
        }
        final HashMap<String, TableInfo.Column> _columnsActivityLocationCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsActivityLocationCrossRef.put("activityId", new TableInfo.Column("activityId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsActivityLocationCrossRef.put("locationId", new TableInfo.Column("locationId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysActivityLocationCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesActivityLocationCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoActivityLocationCrossRef = new TableInfo("ActivityLocationCrossRef", _columnsActivityLocationCrossRef, _foreignKeysActivityLocationCrossRef, _indicesActivityLocationCrossRef);
        final TableInfo _existingActivityLocationCrossRef = TableInfo.read(_db, "ActivityLocationCrossRef");
        if (! _infoActivityLocationCrossRef.equals(_existingActivityLocationCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "ActivityLocationCrossRef(com.psdemo.outdoorexplorer.data.ActivityLocationCrossRef).\n"
                  + " Expected:\n" + _infoActivityLocationCrossRef + "\n"
                  + " Found:\n" + _existingActivityLocationCrossRef);
        }
        final HashMap<String, TableInfo.Column> _columnsRegion = new HashMap<String, TableInfo.Column>(3);
        _columnsRegion.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegion.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegion.put("color", new TableInfo.Column("color", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRegion = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRegion = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRegion = new TableInfo("Region", _columnsRegion, _foreignKeysRegion, _indicesRegion);
        final TableInfo _existingRegion = TableInfo.read(_db, "Region");
        if (! _infoRegion.equals(_existingRegion)) {
          return new RoomOpenHelper.ValidationResult(false, "Region(com.psdemo.outdoorexplorer.data.Region).\n"
                  + " Expected:\n" + _infoRegion + "\n"
                  + " Found:\n" + _existingRegion);
        }
        final HashMap<String, TableInfo.Column> _columnsRegionPoint = new HashMap<String, TableInfo.Column>(4);
        _columnsRegionPoint.put("regionPointId", new TableInfo.Column("regionPointId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegionPoint.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegionPoint.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegionPoint.put("regionId", new TableInfo.Column("regionId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRegionPoint = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRegionPoint = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRegionPoint = new TableInfo("RegionPoint", _columnsRegionPoint, _foreignKeysRegionPoint, _indicesRegionPoint);
        final TableInfo _existingRegionPoint = TableInfo.read(_db, "RegionPoint");
        if (! _infoRegionPoint.equals(_existingRegionPoint)) {
          return new RoomOpenHelper.ValidationResult(false, "RegionPoint(com.psdemo.outdoorexplorer.data.RegionPoint).\n"
                  + " Expected:\n" + _infoRegionPoint + "\n"
                  + " Found:\n" + _existingRegionPoint);
        }
        final HashMap<String, TableInfo.Column> _columnsWorkout = new HashMap<String, TableInfo.Column>(4);
        _columnsWorkout.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkout.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkout.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkout.put("distance", new TableInfo.Column("distance", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWorkout = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWorkout = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWorkout = new TableInfo("Workout", _columnsWorkout, _foreignKeysWorkout, _indicesWorkout);
        final TableInfo _existingWorkout = TableInfo.read(_db, "Workout");
        if (! _infoWorkout.equals(_existingWorkout)) {
          return new RoomOpenHelper.ValidationResult(false, "Workout(com.psdemo.outdoorexplorer.data.Workout).\n"
                  + " Expected:\n" + _infoWorkout + "\n"
                  + " Found:\n" + _existingWorkout);
        }
        final HashMap<String, TableInfo.Column> _columnsWorkoutPoint = new HashMap<String, TableInfo.Column>(5);
        _columnsWorkoutPoint.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkoutPoint.put("workoutId", new TableInfo.Column("workoutId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkoutPoint.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkoutPoint.put("latitude", new TableInfo.Column("latitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkoutPoint.put("longitude", new TableInfo.Column("longitude", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWorkoutPoint = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWorkoutPoint = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWorkoutPoint = new TableInfo("WorkoutPoint", _columnsWorkoutPoint, _foreignKeysWorkoutPoint, _indicesWorkoutPoint);
        final TableInfo _existingWorkoutPoint = TableInfo.read(_db, "WorkoutPoint");
        if (! _infoWorkoutPoint.equals(_existingWorkoutPoint)) {
          return new RoomOpenHelper.ValidationResult(false, "WorkoutPoint(com.psdemo.outdoorexplorer.data.WorkoutPoint).\n"
                  + " Expected:\n" + _infoWorkoutPoint + "\n"
                  + " Found:\n" + _existingWorkoutPoint);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ad86c2060513934818f2a3a4cd96802b", "03526a223f26f755efe00122721dab8a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Activity","Location","ActivityLocationCrossRef","Region","RegionPoint","Workout","WorkoutPoint");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Activity`");
      _db.execSQL("DELETE FROM `Location`");
      _db.execSQL("DELETE FROM `ActivityLocationCrossRef`");
      _db.execSQL("DELETE FROM `Region`");
      _db.execSQL("DELETE FROM `RegionPoint`");
      _db.execSQL("DELETE FROM `Workout`");
      _db.execSQL("DELETE FROM `WorkoutPoint`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(OutdoorDao.class, OutdoorDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public OutdoorDao outdoorDao() {
    if (_outdoorDao != null) {
      return _outdoorDao;
    } else {
      synchronized(this) {
        if(_outdoorDao == null) {
          _outdoorDao = new OutdoorDao_Impl(this);
        }
        return _outdoorDao;
      }
    }
  }
}
