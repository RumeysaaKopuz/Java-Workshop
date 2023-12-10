package com.example.rentacar.services.abstracts;

import com.example.rentacar.entities.Customer;
import com.example.rentacar.services.dtos.customer.request.AddCustomerRequest;
import com.example.rentacar.services.dtos.customer.request.UpdateCustomerRequest;
import com.example.rentacar.services.dtos.customer.response.GetAllCustomerResponse;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerService {
    void add(Customer customer);
    void delete( int id);
    Customer getById( int id);
    void update(UpdateCustomerRequest updateCustomerRequest);
    List<GetAllCustomerResponse> getAll();
}
