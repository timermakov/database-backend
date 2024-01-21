package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddHealthRequest;
import com.java.course.isdb.dto.request.RemoveHealthRequest;
import com.java.course.isdb.dto.response.ListHealthResponse;
import com.java.course.isdb.dto.response.HealthResponse;
import com.java.course.isdb.service.HealthService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("health")
public class HealthController {

    private final HealthService healthService;

    @PostMapping("/add")
    public HealthResponse addHealth(@RequestBody AddHealthRequest addHealthRequest){
        return HealthResponse.fromEntity(
                healthService.add(addHealthRequest.hitpoints(), addHealthRequest.armor(), addHealthRequest.shield())
        );
    }

    @DeleteMapping("/remove")
    public HealthResponse removeHealth(@RequestBody RemoveHealthRequest removeHealthRequest){
        log.info("Removing health with id {}", removeHealthRequest.id());
        return HealthResponse.fromEntity(
                healthService.remove(removeHealthRequest.id())
        );
    }

    @GetMapping("/all")
    public ListHealthResponse getAllHealths(){
        return ListHealthResponse.fromEntity(healthService.getAllHealths());
    }

}
