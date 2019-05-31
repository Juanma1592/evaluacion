package com.training;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class persona {

    @Column(name = "first_name", nullable = false)
    private String firstName;

    private Integer age;

    @Column(name = "listaDePets", unique = true, nullable = false)
    private String listaDePets;

    }

