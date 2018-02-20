package com.androidtut.qaifi.roomimplementation.DbUtils;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by Qaifi on 2/18/2018.
 */

@Dao
public interface UserDao {
    @Insert
    void createUser(User user);

    @Query("SELECT * FROM user where username like :strUsername")
    User getUserByUsername(String strUsername);
}
