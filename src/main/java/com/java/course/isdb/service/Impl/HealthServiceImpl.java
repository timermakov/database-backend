package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Health;
import com.java.course.isdb.exception.ResourceNotFoundException;
import com.java.course.isdb.repository.HealthRepository;
import com.java.course.isdb.service.HealthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class HealthServiceImpl implements HealthService {

    private final HealthRepository healthRepository;

    @Override
    @Transactional
    public Health add(Integer hitpoints, Integer armor, Integer shield) {
        Health health = new Health()
                .setHitpoints(hitpoints)
                .setArmor(armor)
                .setShield(shield);

        healthRepository.save(health);

        return health;
    }

    @Override
    @Transactional
    public Health remove(Integer id) {
        Health health = healthRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("health doesn't exist")
        );

        healthRepository.delete(health);

        return health;
    }

    @Override
    @Transactional
    public List<Health> getAllHealths() {
        return healthRepository.findAll();
    }

}
