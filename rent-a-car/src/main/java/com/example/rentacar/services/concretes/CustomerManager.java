package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Customer;
import com.example.rentacar.repositories.CustomerRepository;
import com.example.rentacar.services.abstracts.CustomerService;
import com.example.rentacar.services.dtos.customer.request.AddCustomerRequest;
import com.example.rentacar.services.dtos.customer.request.UpdateCustomerRequest;
import com.example.rentacar.services.dtos.customer.response.GetAllCustomerResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@Service
public class CustomerManager implements CustomerService {
    private final CustomerRepository customerRepository;


    @Override
    public void add(Customer customer){
        customerRepository.save(customer);
    }

    @Override
    public void delete(int id) {
        Customer customerToDelete = customerRepository.findById(id).orElseThrow();
        customerRepository.delete(customerToDelete);
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.findById(id).orElseThrow();

    }


    @Override
    public void update(UpdateCustomerRequest updateCustomerRequest){
        Customer customerToUpdate = customerRepository.findById(updateCustomerRequest.getId()).orElseThrow();
        customerToUpdate.setFirstName(updateCustomerRequest.getFirstName());
        customerToUpdate.setLastName(updateCustomerRequest.getLastName());
        customerToUpdate.setPhone(updateCustomerRequest.getPhone());
        customerToUpdate.setIdentificationNumber(updateCustomerRequest.getFirstName());
        customerRepository.saveAndFlush(customerToUpdate);
    }
    @Override
    public List<GetAllCustomerResponse> getAll(){
        return customerRepository
                .findAll()
                .stream()
                .map(customer -> new GetAllCustomerResponse(customer.getId(),customer.getFirstName(),customer.getLastName())).toList();

    }

}
