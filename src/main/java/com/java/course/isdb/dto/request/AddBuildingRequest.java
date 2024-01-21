package com.java.course.isdb.dto.request;

public record AddBuildingRequest(String name, Integer health_id, Integer damage_id, Integer vespene_gas, Integer minerals,
                                 Integer supply, Integer race_id) {
}
