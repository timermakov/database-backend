package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Race;

public record RaceResponse(int id, String name){
    public static RaceResponse fromEntity(Race race){
        return new RaceResponse(race.getId(), race.getName());
    }
}
