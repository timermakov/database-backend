package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Map;

public record MapResponse(Integer id, String name, Integer width, Integer height) {
    public static MapResponse fromEntity(Map map){
        return new MapResponse(map.getId(), map.getName(), map.getWidth(), map.getHeight());
    }
}
