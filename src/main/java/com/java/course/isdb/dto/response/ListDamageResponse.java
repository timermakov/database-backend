package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Damage;

import java.util.List;

public record ListDamageResponse(List<DamageResponse> damageResponse) {
    public static ListDamageResponse fromEntity(List<Damage> damages) {
        return new ListDamageResponse(damages.stream().map(DamageResponse::fromEntity).toList());
    }
}
