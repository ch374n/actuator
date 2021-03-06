package com.tech552.springbootactuatordemo.custom;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


public class CustomActuatorEndpoint {
    @ReadOperation
    public Map<String, String> customEndPoint(String id) {
        Map<String, String> map = new HashMap<>();
        map.put("id", id);
        return map;
    }
}
