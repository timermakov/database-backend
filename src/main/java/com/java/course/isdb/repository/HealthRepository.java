package com.java.course.isdb.repository;

import com.java.course.isdb.entity.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<Health, Integer> {

    @Procedure(procedureName = "add_health")
    void addHealth(String name, Integer width, Integer height);

    @Procedure(procedureName = "remove_health")
    void removeHealth(Integer id);

}
