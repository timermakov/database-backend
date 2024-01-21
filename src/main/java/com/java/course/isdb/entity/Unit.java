package com.java.course.isdb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Table(name = "unit")
@Accessors(chain = true)
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "on_ground")
    private Boolean on_ground;

    @Column(name = "health_id")
    private Integer health_id;

    @Column(name = "damage_id")
    private Integer damage_id;

    @Column(name = "building_id")
    private Integer building_id;

    @Column(name = "vespene_gas")
    private Integer vespene_gas;

    @Column(name = "minerals")
    private Integer minerals;

    @Column(name = "supply")
    private Integer supply;

    @Column(name = "race_id")
    private Integer race_id;
}
