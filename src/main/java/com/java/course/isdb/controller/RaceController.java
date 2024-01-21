package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddRaceRequest;
import com.java.course.isdb.dto.request.RemoveMapRequest;
import com.java.course.isdb.dto.request.RemoveRaceRequest;
import com.java.course.isdb.dto.response.MapResponse;
import com.java.course.isdb.dto.response.RaceResponse;
import com.java.course.isdb.dto.response.ListRaceResponse;
import com.java.course.isdb.service.RaceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("race")
public class RaceController {

    private final RaceService raceService;

    @PostMapping("/add")
    public RaceResponse addAmin(@RequestBody AddRaceRequest addRaceRequest){
        return RaceResponse.fromEntity(
                raceService.add(addRaceRequest.name())
        );
    }

    @DeleteMapping("/remove")
    public RaceResponse removeRace(@RequestBody RemoveRaceRequest removeRaceRequest){
        log.info("Removing race with id {}", removeRaceRequest.id());
        return RaceResponse.fromEntity(
                raceService.remove(removeRaceRequest.id())
        );
    }

    @GetMapping("/all")
    public ListRaceResponse getAll(){
        return ListRaceResponse.fromEntity(raceService.getAll());
    }
}
