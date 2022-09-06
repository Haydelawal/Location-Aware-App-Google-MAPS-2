package com.psdemo.outdoorexplorer.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0003H&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH&J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u0003H&J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u000fH&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000fH&\u00a8\u0006\u001e"}, d2 = {"Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "", "getActivityWithLocations", "Landroidx/lifecycle/LiveData;", "Lcom/psdemo/outdoorexplorer/data/ActivityWithLocations;", "activityId", "", "getAllActivities", "", "Lcom/psdemo/outdoorexplorer/data/Activity;", "getAllLocations", "Lcom/psdemo/outdoorexplorer/data/Location;", "getAllRegionsWithPoints", "Lcom/psdemo/outdoorexplorer/data/RegionWithPoints;", "getAllWorkouts", "Lcom/psdemo/outdoorexplorer/data/Workout;", "getLocationById", "locationId", "getLocationWithActivities", "Lcom/psdemo/outdoorexplorer/data/LocationWithActivities;", "insertWorkout", "workout", "insertWorkoutPoint", "", "workoutPoint", "Lcom/psdemo/outdoorexplorer/data/WorkoutPoint;", "toggleActivityGeofence", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "id", "updateWorkout", "app_debug"})
public abstract interface OutdoorRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Activity>> getAllActivities();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.ActivityWithLocations> getActivityWithLocations(int activityId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.psdemo.outdoorexplorer.data.Location getLocationById(int locationId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.psdemo.outdoorexplorer.data.LocationWithActivities> getLocationWithActivities(int locationId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.psdemo.outdoorexplorer.data.GeofencingChanges toggleActivityGeofence(int id);
    
    public abstract int insertWorkout(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.Workout workout);
    
    public abstract void insertWorkoutPoint(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.WorkoutPoint workoutPoint);
    
    public abstract void updateWorkout(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.Workout workout);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Workout>> getAllWorkouts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.psdemo.outdoorexplorer.data.RegionWithPoints> getAllRegionsWithPoints();
}