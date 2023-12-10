package com.example.rentacar.repositories;

import com.example.rentacar.entities.Customer;
import com.example.rentacar.entities.Payment;
import com.example.rentacar.entities.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
}
