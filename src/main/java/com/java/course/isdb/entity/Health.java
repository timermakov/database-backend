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
@Table(name = "health")
@Accessors(chain = true)
public class Health {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hitpoints", nullable = false)
    private Integer hitpoints;

    @Column(name = "armor")
    private Integer armor;

    @Column(name = "shield")
    private Integer shield;
    
}
