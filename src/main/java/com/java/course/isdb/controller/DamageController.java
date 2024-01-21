package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.AddDamageRequest;
import com.java.course.isdb.dto.request.RemoveDamageRequest;
import com.java.course.isdb.dto.response.DamageResponse;
import com.java.course.isdb.dto.response.ListDamageResponse;
import com.java.course.isdb.service.DamageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("damage")
public class DamageController {

    private final DamageService damageService;

    @PostMapping("/add")
    public DamageResponse addDamage(@RequestBody AddDamageRequest addDamageRequest){
        return DamageResponse.fromEntity(
                damageService.add(addDamageRequest.value(), addDamageRequest.splash(),
                        addDamageRequest.ground(), addDamageRequest.air(), addDamageRequest.range())
        );
    }

    @DeleteMapping("/remove")
    public DamageResponse removeDamage(@RequestBody RemoveDamageRequest removeDamageRequest){
        log.info("Removing damage with id {}", removeDamageRequest.id());
        return DamageResponse.fromEntity(
                damageService.remove(removeDamageRequest.id())
        );
    }


    @GetMapping("/all")
    public ListDamageResponse getAllDamages(){
        log.info("List all damages");
        return ListDamageResponse.fromEntity(damageService.getAllDamages());
    }




}
