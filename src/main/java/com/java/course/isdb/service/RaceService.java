package com.java.course.isdb.service;


import com.java.course.isdb.entity.Race;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RaceService {
    @Transactional
    Race add(String name);
    @Transactional
    Race remove(Integer id);
    @Transactional
    List<Race> getAll();
}
