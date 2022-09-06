package com.psdemo.outdoorexplorer.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0003J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J-\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00172\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120%2\u0006\u0010&\u001a\u00020\'H\u0016\u00a2\u0006\u0002\u0010(J\u001a\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010+\u001a\u00020\u00142\b\b\u0001\u0010,\u001a\u00020\u00172\b\b\u0001\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u00060"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesAdapter$OnClickListener;", "()V", "activitiesViewModel", "Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesViewModel;", "geofencingChanges", "Lcom/psdemo/outdoorexplorer/data/GeofencingChanges;", "geofencingClient", "Lcom/google/android/gms/location/GeofencingClient;", "pendingIntent", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "pendingIntent$delegate", "Lkotlin/Lazy;", "checkPermissions", "", "", "handleGeoFencing", "", "onClick", "id", "", "title", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onGeofenceClick", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "requestPermission", "snackbarMessage", "rationale", "permission", "Companion", "app_debug"})
public final class ActivitiesFragment extends androidx.fragment.app.Fragment implements com.psdemo.outdoorexplorer.ui.activities.ActivitiesAdapter.OnClickListener {
    private com.psdemo.outdoorexplorer.ui.activities.ActivitiesViewModel activitiesViewModel;
    private com.google.android.gms.location.GeofencingClient geofencingClient;
    private com.psdemo.outdoorexplorer.data.GeofencingChanges geofencingChanges;
    private final kotlin.Lazy pendingIntent$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.psdemo.outdoorexplorer.ui.activities.ActivitiesFragment.Companion Companion = null;
    public static final int RC_LOCATION = 10;
    private java.util.HashMap _$_findViewCache;
    
    public ActivitiesFragment() {
        super();
    }
    
    private final android.app.PendingIntent getPendingIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onClick(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void onGeofenceClick(int id) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @pub.devrel.easypermissions.AfterPermissionGranted(value = 10)
    private final void handleGeoFencing() {
    }
    
    private final void requestPermission(@androidx.annotation.StringRes()
    int snackbarMessage, @androidx.annotation.StringRes()
    int rationale, java.lang.String permission) {
    }
    
    private final java.util.List<java.lang.String> checkPermissions() {
        return null;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/activities/ActivitiesFragment$Companion;", "", "()V", "RC_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}