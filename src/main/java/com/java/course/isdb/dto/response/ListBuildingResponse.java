package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Building;

import java.util.List;

public record ListBuildingResponse(List<BuildingResponse> buildingResponses) {
    public static ListBuildingResponse fromEntity(List<Building> buildings){
        return new ListBuildingResponse(
                buildings.stream().map(BuildingResponse::fromEntity).toList()
        );
    }
}
