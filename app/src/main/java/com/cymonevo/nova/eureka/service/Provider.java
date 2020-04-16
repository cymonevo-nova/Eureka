package com.cymonevo.nova.eureka.service;

import android.content.Context;

import com.cymonevo.nova.eureka.config.api.GithubConfig;
import com.cymonevo.nova.eureka.config.api.PrayerTimeConfig;
import com.cymonevo.nova.eureka.config.db.DBConfig;
import com.cymonevo.nova.eureka.core.retrofit.RetrofitClient;
import com.cymonevo.nova.eureka.core.room.RoomClient;
import com.cymonevo.nova.eureka.service.api.github.GithubAPI;
import com.cymonevo.nova.eureka.service.api.prayer_time.PrayerTimeAPI;
import com.cymonevo.nova.eureka.service.db.user.UserDB;

public class Provider {
    private static GithubAPI githubAPI;
    private static PrayerTimeAPI prayerTimeAPI;
    private static UserDB userDB;

    public static GithubAPI getGithubAPI() {
        if (githubAPI == null) {
            githubAPI = new GithubAPI(new RetrofitClient(GithubConfig.BASE_URL));
        }
        return githubAPI;
    }

    public static PrayerTimeAPI getPrayerTimeAPI() {
        if (prayerTimeAPI == null) {
            prayerTimeAPI = new PrayerTimeAPI(new RetrofitClient(PrayerTimeConfig.BASE_URL));
        }
        return prayerTimeAPI;
    }

    public static UserDB getUserDB(Context context) {
        if (userDB == null) {
            userDB = new UserDB(new RoomClient(context, DBConfig.SQLITE_DB_NAME));
        }
        return userDB;
    }
}
