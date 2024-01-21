package com.java.course.isdb.repository;

import com.java.course.isdb.entity.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {

    @Procedure(procedureName = "add_building")
    void addBuilding(String name, Integer healthId, Integer damageId, Integer vespene_gas, Integer minerals, Integer supply, Integer raceId );

    @Procedure(procedureName = "remove_building")
    void removeBuilding(Integer id);
}
