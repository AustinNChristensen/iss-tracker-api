package com.austinchristensen.spacestation.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class SpaceStationTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpaceStationTrackerApplication.class, args);
	}

}