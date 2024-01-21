package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.MapResources;

public record MapResourcesResponse(int resourceId, int map_id){
    public static MapResourcesResponse fromEntity(MapResources mapResources){
        return new MapResourcesResponse(
                mapResources.getResource().getId(),
                mapResources.getMap().getId()
        );
    }
}
