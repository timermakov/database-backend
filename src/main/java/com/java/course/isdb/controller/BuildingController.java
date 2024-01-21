package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddBuildingRequest;
import com.java.course.isdb.dto.request.RemoveBuildingRequest;
import com.java.course.isdb.dto.response.BuildingResponse;
import com.java.course.isdb.dto.response.ListBuildingResponse;
import com.java.course.isdb.service.BuildingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("building")
public class BuildingController {

    private final BuildingService buildingService;

    @PostMapping("/add")
    public BuildingResponse add(@RequestBody AddBuildingRequest addBuildingRequest){
        return BuildingResponse.fromEntity(
                buildingService.add(
                        addBuildingRequest.name(),
                        addBuildingRequest.health_id(),
                        addBuildingRequest.damage_id(),
                        addBuildingRequest.vespene_gas(),
                        addBuildingRequest.minerals(),
                        addBuildingRequest.supply(),
                        addBuildingRequest.race_id())
        );
    }

    @DeleteMapping("/remove")
    public BuildingResponse removeBuilding(@RequestBody RemoveBuildingRequest removeBuildingRequest){
        log.info("Removing building with id {}", removeBuildingRequest.id());
        return BuildingResponse.fromEntity(
                buildingService.remove(removeBuildingRequest.id())
        );
    }


    @GetMapping("/all")
    public ListBuildingResponse getAll(){
        return ListBuildingResponse.fromEntity(buildingService.getAll());
    }
}
