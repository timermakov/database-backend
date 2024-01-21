package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Health;

import java.util.List;

public record ListHealthResponse(List<HealthResponse> healthResponses) {
    public static ListHealthResponse fromEntity(List<Health> healths){
        return new ListHealthResponse(
                healths.stream().map(HealthResponse::fromEntity).toList()
        );
    }
}
