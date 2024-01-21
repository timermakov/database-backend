package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Health;

public record HealthResponse(Integer id, Integer hitpoints, Integer armor, Integer shield) {
    public static HealthResponse fromEntity(Health health){
        return new HealthResponse(health.getId(), health.getHitpoints(), health.getArmor(), health.getShield());
    }
}
