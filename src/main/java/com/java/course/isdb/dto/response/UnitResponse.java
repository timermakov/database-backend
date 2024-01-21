package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Unit;

public record UnitResponse(Integer id, String name, Boolean onGround, Integer healthId, Integer damageId,
                           Integer buildingId, Integer minerals, Integer supply, Integer raceId, Integer vespeneGas) {
    public static UnitResponse fromEntity(Unit unit){
        return new UnitResponse(
                unit.getId(),
                unit.getName(),
                unit.getOn_ground(),
                unit.getHealth_id(),
                unit.getDamage_id(),
                unit.getBuilding_id(),
                unit.getVespene_gas(),
                unit.getMinerals(),
                unit.getSupply(),
                unit.getRace_id()
                );
    }
}
