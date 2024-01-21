package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Map;
import com.java.course.isdb.entity.MapResources;
import com.java.course.isdb.exception.ResourceNotFoundException;
import com.java.course.isdb.repository.MapResourcesRepository;
import com.java.course.isdb.repository.MapRepository;
import com.java.course.isdb.service.MapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MapServiceImpl implements MapService {

    private final MapRepository mapRepository;
    private final MapResourcesRepository mapResourcesRepository;

    @Override
    @Transactional
    public Map add(String name, Integer width, Integer height) {
        Map map = new Map()
                .setName(name)
                .setWidth(width)
                .setHeight(height);

        mapRepository.save(map);

        return map;
    }

    @Override
    @Transactional
    public Map remove(Integer id) {
        Map map = mapRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("map doesn't exist")
        );

        mapRepository.delete(map);

        return map;
    }

    @Override
    public List<Map> getAllMaps() {
        return mapRepository.findAll();
    }

    @Override
    public List<MapResources> getAllMapResources() {
        return mapResourcesRepository.findAll();
    }
}
