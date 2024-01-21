package com.java.course.isdb.repository;

import com.java.course.isdb.entity.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;


@Repository
public interface DamageRepository extends JpaRepository<Damage, Integer> {

    @Procedure(procedureName = "add_damage")
    void addDamage(Integer id, Integer value, Boolean splash, Boolean ground, Boolean air, Integer range);

    @Procedure(procedureName = "remove_damage")
    void removeDamage(Integer id);

}
