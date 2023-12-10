package com.example.rentacar.repositories;

import com.example.rentacar.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository <Vehicle,Integer> {
}
