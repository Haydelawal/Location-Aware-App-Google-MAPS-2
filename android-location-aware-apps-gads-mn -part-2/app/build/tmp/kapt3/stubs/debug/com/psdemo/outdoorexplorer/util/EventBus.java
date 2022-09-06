package com.psdemo.outdoorexplorer.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/psdemo/outdoorexplorer/util/EventBus;", "", "()V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/psdemo/outdoorexplorer/util/EventBus$Event;", "getLiveData", "subject", "Lcom/psdemo/outdoorexplorer/data/EventSubject;", "post", "", "event", "Event", "app_debug"})
public final class EventBus {
    @org.jetbrains.annotations.NotNull()
    public static final com.psdemo.outdoorexplorer.util.EventBus INSTANCE = null;
    private static final androidx.lifecycle.MutableLiveData<com.psdemo.outdoorexplorer.util.EventBus.Event> liveData = null;
    
    private EventBus() {
        super();
    }
    
    public final void post(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.EventSubject subject, @org.jetbrains.annotations.Nullable()
    java.lang.Object event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.psdemo.outdoorexplorer.util.EventBus.Event> getLiveData(@org.jetbrains.annotations.NotNull()
    com.psdemo.outdoorexplorer.data.EventSubject subject) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/psdemo/outdoorexplorer/util/EventBus$Event;", "", "subject", "Lcom/psdemo/outdoorexplorer/data/EventSubject;", "value", "(Lcom/psdemo/outdoorexplorer/data/EventSubject;Ljava/lang/Object;)V", "read", "", "getSubject", "()Lcom/psdemo/outdoorexplorer/data/EventSubject;", "getValue", "isRead", "setRead", "", "app_debug"})
    public static final class Event {
        @org.jetbrains.annotations.NotNull()
        private final com.psdemo.outdoorexplorer.data.EventSubject subject = null;
        private final java.lang.Object value = null;
        private boolean read = false;
        
        public Event(@org.jetbrains.annotations.NotNull()
        com.psdemo.outdoorexplorer.data.EventSubject subject, @org.jetbrains.annotations.Nullable()
        java.lang.Object value) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.psdemo.outdoorexplorer.data.EventSubject getSubject() {
            return null;
        }
        
        public final void setRead() {
        }
        
        public final boolean isRead() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getValue() {
            return null;
        }
    }
}