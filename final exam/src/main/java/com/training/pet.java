package com.training;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class pet {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "raceName", unique = true, nullable = false)
    private String raceName;

    @Column(name = "animalType", unique = true, nullable = false)
    private String animalType;

}
