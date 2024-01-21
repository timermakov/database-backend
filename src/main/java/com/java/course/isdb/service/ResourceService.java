package com.java.course.isdb.service;

import com.java.course.isdb.entity.Resource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ResourceService {
    @Transactional
    Resource add(Integer map_id, Integer resource_type_id, Integer quantity, Integer x, Integer y);
    @Transactional
    Resource remove(Integer resourceId);
    @Transactional
    List<Resource> getAllResources();
}
