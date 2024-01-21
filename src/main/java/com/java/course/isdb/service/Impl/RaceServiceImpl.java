package com.java.course.isdb.service.Impl;

import com.java.course.isdb.entity.Race;
import com.java.course.isdb.exception.RaceNotFoundException;
import com.java.course.isdb.repository.RaceRepository;
import com.java.course.isdb.service.RaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepository raceRepository;

    @Override
    @Transactional
    public Race add(String name) {
        Race race = new Race()
                .setName(name);

        raceRepository.save(race);

        return race;
    }

    @Override
    @Transactional
    public Race remove(Integer id) {
        Race race = raceRepository.findById(id).orElseThrow(
                () -> new RaceNotFoundException("race doesn't exist")
        );

        raceRepository.delete(race);

        return race;
    }

    @Override
    @Transactional
    public List<Race> getAll() {
        return raceRepository.findAll();
    }
}
