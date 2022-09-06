package com.psdemo.outdoorexplorer.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0003J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020.H\u0016J-\u0010/\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u001c2\u000e\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u000203022\u0006\u00104\u001a\u000205H\u0016\u00a2\u0006\u0002\u00106J\u001a\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00109\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/MapsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "drawPoints", "Ljava/util/ArrayList;", "Lcom/google/android/gms/maps/model/LatLng;", "drawing", "", "mapViewModel", "Lcom/psdemo/outdoorexplorer/ui/map/MapViewModel;", "markers", "Lcom/google/android/gms/maps/model/Marker;", "myGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "polygons", "Lcom/google/android/gms/maps/model/Polygon;", "polyline", "Lcom/google/android/gms/maps/model/Polyline;", "configureCustomDraw", "", "configureMap", "enableMyLocation", "filterLocations", "getBitmapFromVector", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "vectorResourceId", "", "colorResourceId", "loadLocations", "loadRegions", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "setMapStyle", "Companion", "app_debug"})
public final class MapsFragment extends androidx.fragment.app.Fragment {
    private com.psdemo.outdoorexplorer.ui.map.MapViewModel mapViewModel;
    private com.google.android.gms.maps.GoogleMap myGoogleMap;
    private com.google.android.gms.maps.model.Polyline polyline;
    private final java.util.ArrayList<com.google.android.gms.maps.model.Polygon> polygons = null;
    private final java.util.ArrayList<com.google.android.gms.maps.model.Marker> markers = null;
    private boolean drawing = false;
    private final java.util.ArrayList<com.google.android.gms.maps.model.LatLng> drawPoints = null;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.psdemo.outdoorexplorer.ui.map.MapsFragment.Companion Companion = null;
    public static final int RC_LOCATION = 10;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CUSTOM = "custom";
    private java.util.HashMap _$_findViewCache;
    
    public MapsFragment() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @pub.devrel.easypermissions.AfterPermissionGranted(value = 10)
    private final void enableMyLocation() {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    private final void configureMap() {
    }
    
    private final void loadLocations() {
    }
    
    private final void setMapStyle() {
    }
    
    private final void loadRegions() {
    }
    
    private final void filterLocations() {
    }
    
    private final void configureCustomDraw() {
    }
    
    private final com.google.android.gms.maps.model.BitmapDescriptor getBitmapFromVector(@androidx.annotation.DrawableRes()
    int vectorResourceId, @androidx.annotation.ColorRes()
    int colorResourceId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/MapsFragment$Companion;", "", "()V", "CUSTOM", "", "RC_LOCATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}