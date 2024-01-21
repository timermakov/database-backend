package com.java.course.isdb.controller;

import com.java.course.isdb.dto.request.RemoveResourceRequest;
import com.java.course.isdb.dto.request.AddResourceRequest;

import com.java.course.isdb.dto.response.ResourceResponse;
import com.java.course.isdb.dto.response.ListResourceResponse;
import com.java.course.isdb.service.ResourceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping("resource")
public class ResourceController {

    private final ResourceService resourceService;

    @PostMapping("/add")
    public ResourceResponse addResource(@RequestBody AddResourceRequest addResourceRequest){
        return ResourceResponse.fromEntity(
                resourceService.add(addResourceRequest.map_id(), addResourceRequest.resource_type_id(),
                        addResourceRequest.quantity(), addResourceRequest.x(), addResourceRequest.y())
        );
    }

    @DeleteMapping("/remove")
    public ResourceResponse removeResource(@RequestBody RemoveResourceRequest removeResourceRequest){
        log.info("Removing resource with id {}", removeResourceRequest.id());
        return ResourceResponse.fromEntity(
                resourceService.remove(removeResourceRequest.id())
        );
    }

    @GetMapping("/all")
    public ListResourceResponse getAllResources(){
        log.info("List all resources");
        return ListResourceResponse.fromEntity(resourceService.getAllResources());
    }




}
