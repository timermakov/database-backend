package com.java.course.isdb.dto.response;

import com.java.course.isdb.entity.Race;

import java.util.List;
public record ListRaceResponse(List<RaceResponse> raceResponses) {
    public static ListRaceResponse fromEntity(List<Race> races){
        return new ListRaceResponse(
                races.stream().map(RaceResponse::fromEntity).toList()
        );
    }
}
