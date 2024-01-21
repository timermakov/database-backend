package com.java.course.isdb.service;

import com.java.course.isdb.entity.Unit;
import jakarta.transaction.Transactional;

import java.util.List;

public interface UnitService {

    @Transactional
    Unit add(Integer id, String name, Boolean onGround, Integer healthId, Integer damageId,
             Integer buildingId, Integer vespeneGas, Integer minerals, Integer supply, Integer raceId);

    @Transactional
    Unit remove(Integer id);

    @Transactional
    List<Unit> getAll();
}
