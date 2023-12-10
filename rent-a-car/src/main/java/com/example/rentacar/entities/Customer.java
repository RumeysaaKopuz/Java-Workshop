package com.example.rentacar.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "customers")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String eMail;
    @Column(name = "identification_number")
    private String identificationNumber;
    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Payment> payments;


    @OneToMany(mappedBy = "customer")
@JsonIgnore
    private List<Rental> rental;

}
