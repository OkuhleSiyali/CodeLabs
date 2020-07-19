package com.example.android.trackmysleepquality.database;

import java.lang.System;

/**
 * * Defines methods for using the SleepNight class with Room.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0006\u001a\u00020\u0007H\'J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "", "clear", "", "get", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "key", "", "getAllNights", "Landroidx/lifecycle/LiveData;", "", "getNightWithId", "getTonight", "insert", "night", "update", "app_debug"})
public abstract interface SleepDatabaseDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepNight night);
    
    /**
     * * When updating a row with a value already set in a column,
     *     * replaces the old value with the new one.
     *     *
     *     * @param night new value to write
     */
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepNight night);
    
    /**
     * * Selects and returns the row that matches the supplied start time, which is our key.
     *     *
     *     * @param key startTimeMilli to match
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    public abstract com.example.android.trackmysleepquality.database.SleepNight get(long key);
    
    /**
     * * Deletes all values from the table.
     *     *
     *     * This does not delete the table, only its contents.
     */
    @androidx.room.Query(value = "DELETE FROM daily_sleep_quality_table")
    public abstract void clear();
    
    /**
     * * Selects and returns all rows in the table,
     *     *
     *     * sorted by start time in descending order.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> getAllNights();
    
    /**
     * * Selects and returns the latest night.
     */
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM daily_sleep_quality_table ORDER BY nightId DESC LIMIT 1")
    public abstract com.example.android.trackmysleepquality.database.SleepNight getTonight();
    
    /**
     * * Selects and returns the night with given nightId.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    public abstract androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> getNightWithId(long key);
}