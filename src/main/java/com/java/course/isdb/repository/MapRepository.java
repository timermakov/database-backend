package com.java.course.isdb.repository;

import com.java.course.isdb.entity.Map;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface MapRepository extends JpaRepository<Map, Integer> {

    @Procedure(procedureName = "add_map")
    void addMap(String name, Integer width, Integer height);

    @Procedure(procedureName = "remove_map")
    void removeMap(Integer id);

}
