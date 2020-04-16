package com.cymonevo.nova.eureka.service.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.cymonevo.nova.eureka.service.db.user.UserDao;
import com.cymonevo.nova.eureka.service.db.user.entity.UserData;

@Database(entities = {UserData.class}, version = 1)
public abstract class SqliteDB extends RoomDatabase {
    public abstract UserDao userDao();
}
