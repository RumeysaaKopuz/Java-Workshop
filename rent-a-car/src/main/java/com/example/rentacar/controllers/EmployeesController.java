package com.example.rentacar.controllers;

import com.example.rentacar.entities.Employee;
import com.example.rentacar.repositories.EmployeeRepository;
import com.example.rentacar.services.abstracts.EmployeeService;
import com.example.rentacar.services.dtos.employee.request.AddEmployeeRequest;
import com.example.rentacar.services.dtos.employee.request.UpdateEmployeeRequest;
import com.example.rentacar.services.dtos.employee.response.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("api/employees")
public class EmployeesController {
    private final EmployeeService employeeService;

    @GetMapping("/getAll")
    public  List<GetEmployeeResponse> getAll(){
     return employeeService.getAll();
    }

    @GetMapping("/getById")
    public GetEmployeeResponse getById(@RequestParam int id){
       return employeeService.getById(id);

    }
    @PostMapping("/add")
    public void add(@RequestBody AddEmployeeRequest request){
        employeeService.add(request);

    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        employeeService.delete(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateEmployeeRequest updateEmployeeRequest){
      employeeService.update(updateEmployeeRequest);

    }



}
