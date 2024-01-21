package com.java.course.isdb.entity.compositekey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
@Accessors(chain = true)
public class MapResourceId implements Serializable {

    @Column(name = "resource_id", nullable = false)
    private Integer resourceId;

    @Column(name = "map_id", nullable = false)
    private Integer map_id;
}
