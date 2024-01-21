package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Resource;

public record ResourceResponse(Integer id, Integer map_id, Integer resource_type_id, Integer quantity, Integer x, Integer y) {
    public static ResourceResponse fromEntity(Resource resource){
        return new ResourceResponse(resource.getId(), resource.getMap_id(), resource.getResource_type_id(), resource.getQuantity(), resource.getX(), resource.getY());
    }
}
