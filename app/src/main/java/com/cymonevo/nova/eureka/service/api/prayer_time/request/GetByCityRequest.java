package com.cymonevo.nova.eureka.service.api.prayer_time.request;

public class GetByCityRequest {
    public String country;
    public String city;

    public GetByCityRequest(String country, String city) {
        this.country = country;
        this.city = city;
    }
}
