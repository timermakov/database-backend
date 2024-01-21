package com.java.course.isdb.repository;

import com.java.course.isdb.entity.MapResources;
import com.java.course.isdb.entity.compositekey.MapResourceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MapResourcesRepository extends JpaRepository<MapResources, MapResourceId> {

    List<MapResources> findByMapId(Integer map_id);

}
