package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddMapRequest;
import com.java.course.isdb.dto.request.RemoveMapRequest;
import com.java.course.isdb.dto.response.MapResponse;
import com.java.course.isdb.dto.response.ListMapResourceResponse;
import com.java.course.isdb.dto.response.ListMapResponse;
import com.java.course.isdb.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("map")
public class MapController {

    private final MapService mapService;

    @PostMapping("/add")
    public MapResponse addMap(@RequestBody AddMapRequest addMapRequest){
        return MapResponse.fromEntity(
                mapService.add(addMapRequest.name(), addMapRequest.width(), addMapRequest.height())
        );
    }

    @DeleteMapping("/remove")
    public MapResponse removeMap(@RequestBody RemoveMapRequest removeMapRequest){
        log.info("Removing map with id {}", removeMapRequest.id());
        return MapResponse.fromEntity(
                mapService.remove(removeMapRequest.id())
        );
    }

    @GetMapping("/all")
    public ListMapResponse getAllMaps(){
        return ListMapResponse.fromEntity(mapService.getAllMaps());
    }

    @GetMapping("/allMapResources")
    public ListMapResourceResponse getAllMapResources(){
        return ListMapResourceResponse.fromEntity(mapService.getAllMapResources());
    }

}
