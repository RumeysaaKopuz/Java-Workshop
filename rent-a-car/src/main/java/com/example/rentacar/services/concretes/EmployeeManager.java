 package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Employee;
import com.example.rentacar.repositories.EmployeeRepository;
import com.example.rentacar.services.abstracts.EmployeeService;
import com.example.rentacar.services.dtos.employee.request.AddEmployeeRequest;
import com.example.rentacar.services.dtos.employee.request.UpdateEmployeeRequest;
import com.example.rentacar.services.dtos.employee.response.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeManager implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public void add(AddEmployeeRequest request){
        Employee employeeToAdd = new Employee();
        employeeToAdd.setPosition(request.getPosition());
        employeeToAdd.setAge(request.getAge());
        employeeToAdd.setFirstName(request.getFirstName());
        employeeToAdd.setLastName(request.getLastName());
        employeeRepository.save(employeeToAdd);
    }

    @Override
    public void delete(int id){
        Employee employeeToDelete = employeeRepository.findById(id).orElseThrow();
        employeeRepository.delete(employeeToDelete);
    }

    @Override
    public void update(UpdateEmployeeRequest updateEmployeeRequest){
        Employee employeeToUpdate = employeeRepository.findById(updateEmployeeRequest.getId()).orElseThrow();
        employeeToUpdate.setPosition(updateEmployeeRequest.getPosition());
        employeeToUpdate.setAge(updateEmployeeRequest.getAge());
        employeeToUpdate.setFirstName(updateEmployeeRequest.getFirstName());
        employeeToUpdate.setLastName(updateEmployeeRequest.getLastName());
        employeeRepository.saveAndFlush(employeeToUpdate);
    }

    @Override
    public GetEmployeeResponse getById(int id){
        Employee employeeToId = employeeRepository.findById(id).orElseThrow();
        GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse();
        getEmployeeResponse.setPosition(employeeToId.getPosition());
        getEmployeeResponse.setAge(employeeToId.getAge());
        getEmployeeResponse.setFirstName(employeeToId.getFirstName());
        getEmployeeResponse.setLastName(employeeToId.getLastName());
        getEmployeeResponse.setId(employeeToId.getId());
        return getEmployeeResponse;
    }

    @Override
    public List<GetEmployeeResponse> getAll(){
        return employeeRepository
                .findAll()
                .stream()
                .map(employee -> new GetEmployeeResponse(employee.getId(),employee.getFirstName(),employee.getLastName(),employee.getAge(),employee.getPosition())).toList();



    }



}
