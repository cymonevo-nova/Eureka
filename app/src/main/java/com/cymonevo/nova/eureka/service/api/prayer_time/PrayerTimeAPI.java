package com.cymonevo.nova.eureka.service.api.prayer_time;

import com.cymonevo.nova.eureka.config.Http;
import com.cymonevo.nova.eureka.config.api.PrayerTimeConfig;
import com.cymonevo.nova.eureka.core.retrofit.RetrofitClient;
import com.cymonevo.nova.eureka.service.api.APICall;
import com.cymonevo.nova.eureka.service.api.APIResponse;
import com.cymonevo.nova.eureka.service.api.prayer_time.entity.GetTimeByCityResponse;
import com.cymonevo.nova.eureka.service.api.prayer_time.request.GetByCityRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PrayerTimeAPI {
    private static PrayerTimeService service;

    public PrayerTimeAPI(RetrofitClient client) {
        service = client.getInstance().create(PrayerTimeService.class);
    }

    public void getByCity(APICall activity, int code, GetByCityRequest request) {
        Call<GetTimeByCityResponse> resp = service.getByCity(request.country, request.city);
        resp.enqueue(new Callback<GetTimeByCityResponse>() {
            @Override
            public void onResponse(Call<GetTimeByCityResponse> call, Response<GetTimeByCityResponse> result) {
                APIResponse response;
                if (result.isSuccessful()) {
                    response = new APIResponse(Http.STATUS_OK, Http.MSG_OK, result.body());
                } else {
                    response = new APIResponse(Http.STATUS_ERROR_INTERNAL_SERVER, Http.MSG_ERROR_INTERNAL_SERVER, null);
                }
                activity.onAPIResponse(code, response);
            }

            @Override
            public void onFailure(Call<GetTimeByCityResponse> call, Throwable t) {
                activity.onAPIFailure(code, t.getMessage());
            }
        });
    }
}
