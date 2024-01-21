package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Resource;

import java.util.List;

public record ListResourceResponse(List<ResourceResponse> resourceResponses) {
    public static ListResourceResponse fromEntity(List<Resource> resources) {
        return new ListResourceResponse(resources.stream().map(ResourceResponse::fromEntity).toList());
    }
}
