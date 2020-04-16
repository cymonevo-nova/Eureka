package com.cymonevo.nova.eureka.service.api.prayer_time.entity;

import com.google.gson.annotations.SerializedName;

public class GetTimeByCityResponse {
    public int code;
    public String status;
    public Data data;

    public class Data {
        public Timing timings;
        public Date date;
        public Meta meta;

        public class Timing {
            @SerializedName("Imsak")
            public String imsak;
            @SerializedName("Fajr")
            public String subuh;
            @SerializedName("Sunrise")
            public String sunrise;
            @SerializedName("Dhuhr")
            public String dhuhur;
            @SerializedName("Asr")
            public String ashar;
            @SerializedName("Sunset")
            public String sunset;
            @SerializedName("Maghrib")
            public String maghrib;
            @SerializedName("Isha")
            public String isha;
            @SerializedName("Midnight")
            public String midnight;
        }

        public class Date {
            public String readable;
            public String timestamp;
        }

        public class Meta {
            public String timezone;
        }
    }
}