package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Damage;
import com.java.course.isdb.exception.DamageNotFoundException;
import com.java.course.isdb.repository.DamageRepository;
import com.java.course.isdb.service.DamageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DamageServiceImpl implements DamageService {

    private final DamageRepository damageRepository;

    @Override
    @Transactional
    public Damage add(Integer value, Boolean splash, Boolean ground, Boolean air, Integer range) {
        Damage damage = new Damage()
                .setValue(value)
                .setSplash(splash)
                .setGround(ground)
                .setAir(air)
                .setRange(range);

        damageRepository.save(damage);

        return damage;
    }

    @Override
    @Transactional
    public Damage remove(Integer damageId) {
        Damage damage = damageRepository.findById(damageId).orElseThrow(
                () -> new DamageNotFoundException("damage doesn't exist")
        );

        damageRepository.delete(damage);

        return damage;
    }

    @Override
    @Transactional
    public List<Damage> getAllDamages() {
        return damageRepository.findAll();
    }
}
