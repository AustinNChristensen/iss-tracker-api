package com.austinchristensen.spacestation.demo.service;

import com.austinchristensen.spacestation.demo.models.ISSLocationResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {

    @HystrixCommand(fallbackMethod = "fallback")
    public ISSLocationResponse getLocation() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.json", ISSLocationResponse.class);
    }

    public ISSLocationResponse fallback() {
        ISSLocationResponse issLocationResponse = new ISSLocationResponse();
        issLocationResponse.setMessage("FAILURE");
        return issLocationResponse;
    }
}
