package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Unit;
import com.java.course.isdb.exception.ResourceNotFoundException;
import com.java.course.isdb.repository.UnitRepository;
import com.java.course.isdb.service.UnitService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UnitServiceImpl implements UnitService {

    private final UnitRepository unitRepository;

    @Override
    @Transactional
    public Unit add(Integer id, String name, Boolean onGround, Integer healthId, Integer damageId,
                    Integer buildingId, Integer vespeneGas, Integer minerals, Integer supply, Integer raceId) {

        Unit unit = new Unit()
                .setId(id)
                .setName(name)
                .setOn_ground(onGround)
                .setHealth_id(healthId)
                .setDamage_id(damageId)
                .setBuilding_id(buildingId)
                .setVespene_gas(vespeneGas)
                .setMinerals(minerals)
                .setSupply(supply)
                .setRace_id(raceId);

        unitRepository.save(unit);

        return unit;
    }

    @Override
    @Transactional
    public Unit remove(Integer id) {
        Unit unit = unitRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("unit doesn't exist")
        );

        unitRepository.delete(unit);

        return unit;
    }


    @Override
    @Transactional
    public List<Unit> getAll() {
        return unitRepository.findAll();
    }
}
