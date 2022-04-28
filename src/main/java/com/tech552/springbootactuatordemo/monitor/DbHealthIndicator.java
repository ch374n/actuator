package com.tech552.springbootactuatordemo.monitor;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class DbHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        if(isDbHealthy()) {
            return Health.up().withDetail("External db svc", "up").build();
        }
        return Health.up().withDetail("External db svc", "down").build();
    }
    
    private boolean isDbHealthy() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
