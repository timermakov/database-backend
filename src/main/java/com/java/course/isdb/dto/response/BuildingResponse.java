package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Building;

public record BuildingResponse(Integer id, Integer healthId, Integer damageId, Integer vespeneGas, Integer minerals,
                               Integer supply, Integer raceId) {
    public static BuildingResponse fromEntity(Building building){
        return new BuildingResponse(
                building.getId(),
                building.getHealth(),
                building.getDamage(),
                building.getVespene_gas(),
                building.getMinerals(),
                building.getSupply(),
                building.getRace_id()
        );
    }
}
