package com.example.rentacar.controllers;

import com.example.rentacar.entities.Customer;
import com.example.rentacar.repositories.CustomerRepository;
import com.example.rentacar.services.abstracts.CustomerService;
import com.example.rentacar.services.dtos.customer.request.AddCustomerRequest;
import com.example.rentacar.services.dtos.customer.request.UpdateCustomerRequest;
import com.example.rentacar.services.dtos.customer.response.GetAllCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("api/customers")
public class CustomersController {
    private final CustomerService customerService;

// Dependency Injection
    @GetMapping("/getAll")
    public List<GetAllCustomerResponse> getAll(){
       return customerService.getAll();
    }
    @GetMapping("/getById/{id}")
    public  Customer getById(@PathVariable int id){
        return customerService.getById(id);
    }
    @PostMapping("/add")
    public void add(Customer customer){
        customerService.add(customer);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        customerService.delete(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest) {
      customerService.update(updateCustomerRequest);
    }




}
// http://localhost:8080/api/customer GET
