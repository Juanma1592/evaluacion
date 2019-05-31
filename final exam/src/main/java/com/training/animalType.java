package com.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class animalType {

    @Enumerated(EnumType.STRING)
    @Column(name = "terrain")
    private terrain terrain;

    @Enumerated(EnumType.STRING)
    @Column(name = "legCount")
    private legCount legCount;
}

