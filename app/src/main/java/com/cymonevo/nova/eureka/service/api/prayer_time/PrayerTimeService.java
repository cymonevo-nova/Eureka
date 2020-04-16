package com.cymonevo.nova.eureka.service.api.prayer_time;

import com.cymonevo.nova.eureka.config.api.PrayerTimeConfig;
import com.cymonevo.nova.eureka.service.api.prayer_time.entity.GetTimeByCityResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;


public interface PrayerTimeService {
    const String[] header = new String[]{
    };

    @Headers(header)
    @GET("timingsByCity")
    Call<GetTimeByCityResponse> getByCity(@Query("country") String country, @Query("city") String city);
}
