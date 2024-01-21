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
@Table(name = "resource")
@Accessors(chain = true)
public class Resource {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "map_id")
    private Integer map_id;

    @Column(name = "resource_type_id")
    private Integer resource_type_id;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "x")
    private Integer x;

    @Column(name = "y")
    private Integer y;

    @OneToMany(mappedBy = "resource")
    private Set<MapResources> mapResources = new HashSet<>();

    public void addMapResources(MapResources mapResources) {
        this.mapResources.add(mapResources);
        mapResources.setResource(this);
    }


}
