package com.example.rentacar.entities;

import jakarta.persistence.*;
import jdk.jfr.SettingDefinition;
import lombok.*;

import java.util.List;
@Data
@Table(name = "payment_methods")
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "card_name")
    private String cardName;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "expiration_date")
    private java.sql.Date expirationDate;
    @Column(name = "cvv")
    private String cvv;

    @OneToMany(mappedBy = "paymentMethod")
    private List<Payment> payments;



}
