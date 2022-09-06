package com.psdemo.outdoorexplorer.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0011J\u0015\u0010!\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010#R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u00170\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u00a8\u0006$"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/MapViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allLocations", "Landroidx/lifecycle/LiveData;", "", "Lcom/psdemo/outdoorexplorer/data/Location;", "getAllLocations", "()Landroidx/lifecycle/LiveData;", "allRegions", "Lcom/psdemo/outdoorexplorer/data/RegionWithPoints;", "getAllRegions", "()Ljava/util/List;", "beginCustomDraw", "Landroidx/lifecycle/MutableLiveData;", "", "getBeginCustomDraw", "()Landroidx/lifecycle/MutableLiveData;", "outdoorRepository", "Lcom/psdemo/outdoorexplorer/data/OutdoorRepository;", "selectedRegions", "Lkotlin/Pair;", "Lcom/psdemo/outdoorexplorer/data/Region;", "getSelectedRegions", "visibleRegionIds", "Ljava/util/ArrayList;", "", "getVisibleRegionIds", "setBeginCustomDraw", "", "status", "toggleVisibleRegion", "id", "(Ljava/lang/Integer;)V", "app_debug"})
public final class MapViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.psdemo.outdoorexplorer.data.OutdoorRepository outdoorRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> visibleRegionIds = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.psdemo.outdoorexplorer.data.RegionWithPoints> allRegions = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> allLocations = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> beginCustomDraw = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<kotlin.Pair<com.psdemo.outdoorexplorer.data.Region, java.lang.Boolean>>> selectedRegions = null;
    
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> getVisibleRegionIds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.psdemo.outdoorexplorer.data.RegionWithPoints> getAllRegions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.psdemo.outdoorexplorer.data.Location>> getAllLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBeginCustomDraw() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<kotlin.Pair<com.psdemo.outdoorexplorer.data.Region, java.lang.Boolean>>> getSelectedRegions() {
        return null;
    }
    
    public final void toggleVisibleRegion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
    }
    
    public final void setBeginCustomDraw(boolean status) {
    }
}