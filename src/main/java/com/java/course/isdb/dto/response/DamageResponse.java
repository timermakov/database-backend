package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Damage;

public record DamageResponse(Integer id, Integer value, Boolean splash, Boolean ground, Boolean air, Integer range) {
    public static DamageResponse fromEntity(Damage damage){
        return new DamageResponse(damage.getId(), damage.getValue(), damage.getSplash(), damage.getGround(), damage.getAir(), damage.getRange());
    }
}
