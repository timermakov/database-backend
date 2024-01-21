package com.java.course.isdb.repository;

import com.java.course.isdb.entity.ResourceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface ResourceTypeRepository extends JpaRepository<ResourceType, Integer> {

    //@Procedure(procedureName = "add_resource_type")
    //void addResourceType(String name);

    //@Procedure(procedureName = "remove_resource_type")
    //void removeResourceType(Integer id);

}
