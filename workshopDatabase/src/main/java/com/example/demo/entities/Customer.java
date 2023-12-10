package com.example.demo.entities;


import jakarta.persistence.*;

import java.util.List;


@Table(name = "customers")
@Entity
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "e_mail")
    private String email;

    @Column(name = "phone")
    private int phone;

    @OneToMany(mappedBy = "customer")
private List<Rental> rentals;

}
