package com.zanzan.bruinnews;

import android.app.Application;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.zanzan.bruinnews.database.BruinNewsDatabase;

public class BruinNewsApplication extends Application {

    private static BruinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);

        database = Room.databaseBuilder(this, BruinNewsDatabase.class, "bruinnews_db").build();
    }

    public static BruinNewsDatabase getDatabase() {
        return database;
    }
}
