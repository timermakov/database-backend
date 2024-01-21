package com.java.course.isdb.dto.request;

public record AddUnitRequest(Integer id, String name, Boolean onGround, Integer healthId, Integer damageId,
                             Integer buildingId, Integer minerals, Integer supply, Integer raceId, Integer vespeneGas) {
}
