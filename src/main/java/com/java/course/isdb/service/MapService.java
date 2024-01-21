package com.java.course.isdb.service;

import com.java.course.isdb.entity.Map;
import com.java.course.isdb.entity.MapResources;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface MapService {
    @Transactional
    Map add(String name, Integer width, Integer height);
    @Transactional
    Map remove(Integer id);
    @Transactional
    List<Map> getAllMaps();
    @Transactional
    List<MapResources> getAllMapResources();
}
