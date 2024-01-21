package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.ResourceType;

import java.util.List;

public record ListResourceTypeResponse(List<ResourceTypeResponse> resourceTypeResponses) {
    public static ListResourceTypeResponse fromEntity(List<ResourceType> resourcesTypes) {
        return new ListResourceTypeResponse(
                resourcesTypes.stream().map(ResourceTypeResponse::fromEntity).toList()
        );
    }
}
