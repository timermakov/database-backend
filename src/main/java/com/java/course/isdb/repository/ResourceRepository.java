package com.java.course.isdb.repository;

import com.java.course.isdb.entity.Map;
import com.java.course.isdb.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ResourceRepository extends JpaRepository<Resource, Integer> {

    @Procedure(procedureName = "add_resource")
    void addResource(Integer map_id, Integer resource_type_id, Integer quantity, Integer x, Integer y);

    @Procedure(procedureName = "remove_resource")
    void removeResource(Integer id);

}
