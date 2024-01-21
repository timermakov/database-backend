package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Unit;

import java.util.List;

public record ListUnitResponse(List<UnitResponse> unitRespons){
    public static ListUnitResponse fromEntity(List<Unit> unitList){
        return new ListUnitResponse(
                unitList.stream().map(UnitResponse::fromEntity).toList()
        );
    }
}
