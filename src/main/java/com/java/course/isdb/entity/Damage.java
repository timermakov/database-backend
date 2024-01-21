package com.java.course.isdb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "damage")
@Accessors(chain = true)
public class Damage {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "value")
    private Integer value;

    @Column(name = "splash")
    private Boolean splash;

    @Column(name = "ground")
    private Boolean ground;

    @Column(name = "air")
    private Boolean air;

    @Column(name = "range")
    private Integer range;


}
