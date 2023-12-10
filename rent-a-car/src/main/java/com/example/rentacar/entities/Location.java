package com.example.rentacar.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "locations")
@Entity
@Getter
@Setter
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "pick_up_location")
    private String pickUpLocation;
    @Column(name = "drop_off_location")
    private String dropOffLocation;

    @OneToMany(mappedBy = "location")
    private List<Rental> rental;


}
