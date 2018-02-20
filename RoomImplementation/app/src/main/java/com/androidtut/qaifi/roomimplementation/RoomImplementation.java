package com.androidtut.qaifi.roomimplementation;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.androidtut.qaifi.roomimplementation.DbUtils.LocalDB;

/**
 * Created by Qaifi on 2/18/2018.
 */

public class RoomImplementation extends Application {
    private static RoomImplementation mInstance;
    private LocalDB dbInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
        dbInstance = Room.databaseBuilder(getApplicationContext(), LocalDB.class, "LocalDB").build();
    }

    public static RoomImplementation getmInstance() {
        return mInstance;
    }

    public LocalDB getDbInstance() {
        return dbInstance;
    }
}
