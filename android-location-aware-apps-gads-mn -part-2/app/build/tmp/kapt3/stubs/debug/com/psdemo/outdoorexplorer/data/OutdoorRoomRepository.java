package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005%&\'()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0006H\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\u0006H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0006H\u0016J\u0018\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u000e0\u000e2\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u001d\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010\u001aJ\u001d\u0010\u001b\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\n \u0014*\u0004\u0018\u00010!0!2\u0006\u0010\"\u001a\u00020\tH\u0016J\u001d\u0010#\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository;", "Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getActivityWithLocations", "Landroidx/lifecycle/LiveData;", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "getAllActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getAllLocations", "Lcom/psdemo/outdoorexplorer/data/Location;", "getAllRegionsWithPoints", "Lcom/psdemo/outdoorexplorer/data/RegionWithPoints;", "getAllWorkouts", "Lcom/psdemo/outdoorexplorer/data/Workout;", "getLocationById", "kotlin.jvm.PlatformType", "locationId", "getLocationWithActivities", "Lcom/psdemo/outdoorexplorer/data/LocationWithActivities;", "insertWorkout", "workout", "(Lcom/psdemo/outdoorexplorer/data/Workout;)Ljava/lang/Integer;", "insertWorkoutPoint", "", "workoutPoint", "Lcom/psdemo/outdoorexplorer/data/WorkoutPoint;", "(Lcom/psdemo/outdoorexplorer/data/WorkoutPoint;)Lkotlin/Unit;", "toggleActivityGeofence", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "id", "updateWorkout", "(Lcom/psdemo/outdoorexplorer/data/Workout;)Lkotlin/Unit;", "GetLocationAsyncTask", "InsertWorkoutAsyncTask", "InsertWorkoutPointAsyncTask", "ToggleAsyncTask", "UpdateWorkoutAsyncTask", "app_debug"})
public final class OutdoorRoomRepository implements com.psdemo.outdoorexplorer.data.OutdoorRepository {
    private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
    
    public OutdoorRoomRepository(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Activity>> getAllActivities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> getActivityWithLocations(int activityId) {
        return null;
    }
    
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.data.Location getLocationById(int locationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.LocationWithActivities> getLocationWithActivities(int locationId) {
        return null;
    }
    
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.data.GeofencingChanges toggleActivityGeofence(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.psdemo.outdoorexplorer.data.RegionWithPoints> getAllRegionsWithPoints() {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.Integer insertWorkout(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.Workout workout) {
        return null;
    }
    
    @java.lang.Override()
    public kotlin.Unit updateWorkout(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.Workout workout) {
        return null;
    }
    
    @java.lang.Override()
    public kotlin.Unit insertWorkoutPoint(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.WorkoutPoint workoutPoint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Workout>> getAllWorkouts() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J%\u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$GetLocationAsyncTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/psdemo/outdoorexplorer/data/Location;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "doInBackground", "ids", "", "([Ljava/lang/Integer;)Lcom/psdemo/outdoorexplorer/data/Location;", "app_debug"})
    static final class GetLocationAsyncTask extends android.os.AsyncTask<java.lang.Integer, kotlin.Unit, com.psdemo.outdoorexplorer.data.Location> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public GetLocationAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.psdemo.outdoorexplorer.data.Location doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... ids) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u0010\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$ToggleAsyncTask;", "Landroid/os/AsyncTask;", "", "", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "createGeofence", "Lcom/google/android/gms/location/Geofence;", "location", "Lcom/psdemo/outdoorexplorer/data/Location;", "doInBackground", "ids", "", "([Ljava/lang/Integer;)Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "app_debug"})
    static final class ToggleAsyncTask extends android.os.AsyncTask<java.lang.Integer, kotlin.Unit, com.psdemo.outdoorexplorer.data.GeofencingChanges> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public ToggleAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected com.psdemo.outdoorexplorer.data.GeofencingChanges doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Integer... ids) {
            return null;
        }
        
        private final com.google.android.gms.location.Geofence createGeofence(com.psdemo.outdoorexplorer.data.Location location) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J!\u0010\n\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$InsertWorkoutAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/psdemo/outdoorexplorer/data/Workout;", "", "", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "doInBackground", "workout", "", "([Lcom/psdemo/outdoorexplorer/data/Workout;)Ljava/lang/Integer;", "app_debug"})
    static final class InsertWorkoutAsyncTask extends android.os.AsyncTask<com.psdemo.outdoorexplorer.data.Workout, kotlin.Unit, java.lang.Integer> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public InsertWorkoutAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.Integer doInBackground(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.Workout... workout) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$InsertWorkoutPointAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/psdemo/outdoorexplorer/data/WorkoutPoint;", "", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "doInBackground", "workoutPoint", "", "([Lcom/psdemo/outdoorexplorer/data/WorkoutPoint;)V", "app_debug"})
    static final class InsertWorkoutPointAsyncTask extends android.os.AsyncTask<com.psdemo.outdoorexplorer.data.WorkoutPoint, kotlin.Unit, kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public InsertWorkoutPointAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.WorkoutPoint... workoutPoint) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRoomRepository$UpdateWorkoutAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/psdemo/outdoorexplorer/data/Workout;", "", "outdoorDao", "Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "(Lcom/psdemo/outdoorexplorer/data/OutdoorDao;)V", "getOutdoorDao", "()Lcom/psdemo/outdoorexplorer/data/OutdoorDao;", "doInBackground", "workout", "", "([Lcom/psdemo/outdoorexplorer/data/Workout;)V", "app_debug"})
    static final class UpdateWorkoutAsyncTask extends android.os.AsyncTask<com.psdemo.outdoorexplorer.data.Workout, kotlin.Unit, kotlin.Unit> {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao = null;
        
        public UpdateWorkoutAsyncTask(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.OutdoorDao outdoorDao) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.OutdoorDao getOutdoorDao() {
            return null;
        }
        
        @java.lang.Override()
        protected void doInBackground(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.Workout... workout) {
        }
    }
}