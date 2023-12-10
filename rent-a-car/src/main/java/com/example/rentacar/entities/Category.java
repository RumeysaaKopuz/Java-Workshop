package com.example.rentacar.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "categories")
@Entity
public class Category {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Vehicle> vehicle;


    public int getId() {
        return 0;
    }
}
