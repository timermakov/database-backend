package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Map;

import java.util.List;

public record ListMapResponse(List<MapResponse> mapResponses) {
    public static ListMapResponse fromEntity(List<Map> maps){
        return new ListMapResponse(
                maps.stream().map(MapResponse::fromEntity).toList()
        );
    }
}
