package com.psdemo.outdoorexplorer.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0017\u0018B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J \u0010\u0015\u001a\u00020\u000e2\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$RegionHolder;", "onClickListener", "Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$OnClickListener;", "(Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$OnClickListener;)V", "allRegions", "", "Lkotlin/Pair;", "Lcom/psdemo/outdoorexplorer/data/Region;", "", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setRegions", "regions", "OnClickListener", "RegionHolder", "app_debug"})
public final class RegionsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.RegionHolder> {
    private final com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.OnClickListener onClickListener = null;
    private java.util.List<kotlin.Pair<com.psdemo.outdoorexplorer.data.Region, java.lang.Boolean>> allRegions;
    
    public RegionsAdapter(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.OnClickListener onClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.RegionHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setRegions(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<com.psdemo.outdoorexplorer.data.Region, java.lang.Boolean>> regions) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.RegionHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$RegionHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter;Landroid/view/View;)V", "bind", "", "pair", "Lkotlin/Pair;", "Lcom/psdemo/outdoorexplorer/data/Region;", "", "clickListener", "Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$OnClickListener;", "app_debug"})
    public final class RegionHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public RegionHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<com.psdemo.outdoorexplorer.data.Region, java.lang.Boolean> pair, @org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.ui.map.RegionsAdapter.OnClickListener clickListener) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/map/RegionsAdapter$OnClickListener;", "", "onClick", "", "id", "", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(int id);
    }
}