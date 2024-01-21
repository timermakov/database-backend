package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.ResourceType;

public record ResourceTypeResponse(Integer id, String name) {
    public static ResourceTypeResponse fromEntity(ResourceType resourceType){
        return new ResourceTypeResponse(resourceType.getId(), resourceType.getName());
    }
}
