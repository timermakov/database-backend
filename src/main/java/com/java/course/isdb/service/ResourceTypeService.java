package com.java.course.isdb.service;

import com.java.course.isdb.entity.ResourceType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ResourceTypeService {
    @Transactional
    ResourceType add(String name);
    @Transactional
    ResourceType remove(Integer resourceTypeId);
    @Transactional
    List<ResourceType> getAllResourceTypes();
}
