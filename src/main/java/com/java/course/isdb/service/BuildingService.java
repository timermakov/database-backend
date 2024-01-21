package com.java.course.isdb.service;

import com.java.course.isdb.entity.Building;
import com.java.course.isdb.exception.BuildingNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BuildingService {
    @Transactional
    Building add(String name, Integer healthId, Integer damageId, Integer vespeneGas, Integer minerals, Integer supply, Integer raceId);
    @Transactional
    Building remove(Integer id) throws BuildingNotFoundException;
    @Transactional
    List<Building> getAll() throws BuildingNotFoundException;
}
