package com.cymonevo.nova.eureka.service.api;

public interface APICall {
    void onAPIResponse(int code, APIResponse response);
    void onAPIFailure(int code, String message);
}
