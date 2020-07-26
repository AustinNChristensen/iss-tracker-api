package com.austinchristensen.spacestation.demo.controllers;

import com.austinchristensen.spacestation.demo.models.ISSLocationResponse;
import com.austinchristensen.spacestation.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class ISSController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public ISSLocationResponse getISSLocation() {
        return this.locationService.getLocation();
    }
}
