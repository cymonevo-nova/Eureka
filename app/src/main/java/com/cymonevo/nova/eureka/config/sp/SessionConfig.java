package com.cymonevo.nova.eureka.config.sp;

import com.cymonevo.nova.eureka.config.Config;

public class SessionConfig {
    public static final String BASE_KEY = String.format("%s%s", Config.PACKAGE_NAME, ".session");

    public static final String KEY_USER_UUID = "USER_UUID";
    public static final String KEY_USER_NAME = "USER_NAME";
}
