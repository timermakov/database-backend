package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.RemoveResourceTypeRequest;
import com.java.course.isdb.dto.request.AddResourceTypeRequest;

import com.java.course.isdb.dto.response.ResourceTypeResponse;
import com.java.course.isdb.dto.response.ListResourceTypeResponse;
import com.java.course.isdb.service.ResourceTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("resource_type")
public class ResourceTypeController {

    private final ResourceTypeService resourceTypeService;

    @PostMapping("/add")
    public ResourceTypeResponse addResourceType(@RequestBody AddResourceTypeRequest addResourceTypeRequest){
        return ResourceTypeResponse.fromEntity(
                resourceTypeService.add(addResourceTypeRequest.name())
        );
    }

    @DeleteMapping("/remove")
    public ResourceTypeResponse removeResourceType(@RequestBody RemoveResourceTypeRequest removeResourceTypeRequest){
        log.info("Removing resource_type with id {}", removeResourceTypeRequest.id());
        return ResourceTypeResponse.fromEntity(
                resourceTypeService.remove(removeResourceTypeRequest.id())
        );
    }

    @GetMapping("/all")
    public ListResourceTypeResponse getAllResourceTypes(){
        log.info("List all resourceTypes");
        return ListResourceTypeResponse.fromEntity(resourceTypeService.getAllResourceTypes());
    }




}
