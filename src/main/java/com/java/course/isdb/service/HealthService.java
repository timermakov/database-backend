package com.java.course.isdb.service;

import com.java.course.isdb.entity.Health;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HealthService {
    @Transactional
    Health add(Integer hitpoints, Integer armor, Integer shield);
    @Transactional
    Health remove(Integer id);
    @Transactional
    List<Health> getAllHealths();

}
