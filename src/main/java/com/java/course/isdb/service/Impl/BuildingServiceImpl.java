package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Building;
import com.java.course.isdb.exception.BuildingNotFoundException;
import com.java.course.isdb.exception.ResourceNotFoundException;
import com.java.course.isdb.repository.BuildingRepository;
import com.java.course.isdb.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BuildingServiceImpl implements BuildingService {

    private final BuildingRepository buildingRepository;

    @Override
    @Transactional
    public Building add(String name, Integer healthId, Integer damageId, Integer vespeneGas, Integer minerals, Integer supply, Integer raceId) {

        Building building = new Building()
                .setName(name)
                .setHealth(healthId)
                .setDamage(damageId)
                .setVespene_gas(vespeneGas)
                .setMinerals(minerals)
                .setSupply(supply)
                .setRace_id(raceId);

        buildingRepository.save(building);

        return building;
    }

    @Override
    @Transactional
    public Building remove(Integer id) throws BuildingNotFoundException {
        Building building = buildingRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("building doesn't exist")
        );

        buildingRepository.delete(building);

        return building;
    }

    @Override
    @Transactional
    public List<Building> getAll() throws BuildingNotFoundException {
        return buildingRepository.findAll();
    }
}
