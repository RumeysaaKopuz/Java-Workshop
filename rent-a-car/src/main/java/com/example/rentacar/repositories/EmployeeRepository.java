package com.example.rentacar.repositories;

import com.example.rentacar.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
}
