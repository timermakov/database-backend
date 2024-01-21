package com.java.course.isdb.entity;

import com.java.course.isdb.entity.compositekey.MapResourceId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Entity
@Table(name = "resource")
@Accessors(chain = true)
public class MapResources {

    @EmbeddedId
    private MapResourceId mapResourceId;

    @ManyToOne
    @MapsId("id")
    @JoinColumn(name = "id")
    private Resource resource;

    @ManyToOne
    @MapsId("map_id")
    @JoinColumn(name = "map_id")
    private Map map;


}
