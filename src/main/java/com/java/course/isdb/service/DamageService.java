package com.java.course.isdb.service;

import com.java.course.isdb.entity.Damage;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface DamageService {
    @Transactional
    Damage add(Integer value, Boolean splash, Boolean ground, Boolean air, Integer range);
    @Transactional
    Damage remove(Integer damageId);
    @Transactional
    List<Damage> getAllDamages();
}
