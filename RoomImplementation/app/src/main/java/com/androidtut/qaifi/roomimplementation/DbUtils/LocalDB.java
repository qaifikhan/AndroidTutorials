package com.androidtut.qaifi.roomimplementation.DbUtils;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Qaifi on 2/18/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class LocalDB extends RoomDatabase {
    public abstract UserDao userDao();
}
