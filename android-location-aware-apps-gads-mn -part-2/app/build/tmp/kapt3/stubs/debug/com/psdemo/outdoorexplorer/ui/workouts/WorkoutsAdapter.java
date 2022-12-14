package com.psdemo.outdoorexplorer.ui.workouts;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/workouts/WorkoutsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/psdemo/outdoorexplorer/ui/workouts/WorkoutsAdapter$WorkoutHolder;", "()V", "allWorkouts", "", "Lcom/psdemo/outdoorexplorer/data/Workout;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setWorkouts", "workouts", "WorkoutHolder", "app_debug"})
public final class WorkoutsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.psdemo.outdoorexplorer.ui.workouts.WorkoutsAdapter.WorkoutHolder> {
    private java.util.List<com.psdemo.outdoorexplorer.data.Workout> allWorkouts;
    
    public WorkoutsAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.psdemo.outdoorexplorer.ui.workouts.WorkoutsAdapter.WorkoutHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setWorkouts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.psdemo.outdoorexplorer.data.Workout> workouts) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.ui.workouts.WorkoutsAdapter.WorkoutHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/psdemo/outdoorexplorer/ui/workouts/WorkoutsAdapter$WorkoutHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/psdemo/outdoorexplorer/ui/workouts/WorkoutsAdapter;Landroid/view/View;)V", "bind", "", "workout", "Lcom/psdemo/outdoorexplorer/data/Workout;", "app_debug"})
    public final class WorkoutHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WorkoutHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.Workout workout) {
        }
    }
}