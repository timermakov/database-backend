package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.MapResources;

import java.util.List;

public record ListMapResourceResponse(List<MapResourcesResponse> mapResourcesResponses){
    public static ListMapResourceResponse fromEntity(List<MapResources> mapResources){
        return new ListMapResourceResponse(
                mapResources.stream().map(MapResourcesResponse::fromEntity).toList()
        );
    }
}
