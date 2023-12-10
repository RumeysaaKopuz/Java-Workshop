package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "vehicles")
@Entity
public class Vehicle {


@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "make_name")
    private String makeName;

    @Column(name = "year")
    private Integer year;

    @OneToMany(mappedBy = "vehicle")
    private List<Rental> rentals;



}
