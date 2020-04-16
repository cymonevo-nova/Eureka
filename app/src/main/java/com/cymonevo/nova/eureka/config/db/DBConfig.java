package com.cymonevo.nova.eureka.config.db;

import com.cymonevo.nova.eureka.config.Config;

public class DBConfig {
    public static final String SQLITE_DB_NAME = String.format("%s%s", Config.PACKAGE_NAME, ".sqlite-db");
}
