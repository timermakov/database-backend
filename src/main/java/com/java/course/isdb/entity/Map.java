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
@Table(name = "map")
@Accessors(chain = true)
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @OneToMany(mappedBy = "map")
    private Set<MapResources> mapResources = new HashSet<>();

}
