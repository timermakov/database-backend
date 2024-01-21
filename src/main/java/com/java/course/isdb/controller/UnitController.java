package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddUnitRequest;
import com.java.course.isdb.dto.response.ListUnitResponse;
import com.java.course.isdb.dto.response.UnitResponse;
import com.java.course.isdb.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("stat")
public class UnitController {

    private final UnitService unitService;

    @PostMapping("/add")
    public UnitResponse add(@RequestBody AddUnitRequest addUnitRequest){
        return UnitResponse.fromEntity(
                unitService.add(
                        addUnitRequest.id(), addUnitRequest.name(), addUnitRequest.onGround(), addUnitRequest.healthId(), addUnitRequest.damageId(),
                        addUnitRequest.buildingId(), addUnitRequest.vespeneGas(), addUnitRequest.minerals(), addUnitRequest.supply(), addUnitRequest.raceId()
                )
        );
    }

    @GetMapping("/all")
    public ListUnitResponse getAll(){
        return ListUnitResponse.fromEntity(unitService.getAll());
    }


}
