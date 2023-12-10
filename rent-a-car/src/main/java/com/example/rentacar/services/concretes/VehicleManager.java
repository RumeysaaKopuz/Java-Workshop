package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Category;
import com.example.rentacar.entities.Vehicle;
import com.example.rentacar.repositories.CategoryRepository;
import com.example.rentacar.repositories.VehicleRepository;
import com.example.rentacar.services.abstracts.VehicleService;
import com.example.rentacar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.requests.UpdateVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.responses.GetAllVehiclesResponse;
import com.example.rentacar.services.dtos.vehicle.responses.GetVehicleResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class VehicleManager implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final CategoryRepository categoryRepository;



    @Override
    public void add(AddVehicleRequest request){
        Vehicle vehicleToAdd = new Vehicle();
        vehicleToAdd.setYear(request.getYear());
        vehicleToAdd.setBrand(request.getBrand());
        vehicleToAdd.setModel(request.getModel());
        Category category = categoryRepository.findById(request.getCategoryId()).orElseThrow();
        vehicleToAdd.setCategory(category);
        vehicleToAdd.setColor(request.getColor());
        vehicleRepository.save(vehicleToAdd);
    }

    @Override
    public void delete(int id){
        Vehicle vehicleToDelete = vehicleRepository.findById(id).orElseThrow();
        vehicleRepository.delete(vehicleToDelete);
    }

    @Override
    public void update(UpdateVehicleRequest updateVehicleRequest){
        Vehicle vehicleToUpdate = vehicleRepository.findById(updateVehicleRequest.getId()).orElseThrow();
        vehicleToUpdate.setYear(updateVehicleRequest.getYear());
        vehicleToUpdate.setBrand(updateVehicleRequest.getBrand());
        vehicleToUpdate.setModel(updateVehicleRequest.getModel());
        Category category = categoryRepository.findById(updateVehicleRequest.getCategoryId()).orElseThrow();
        vehicleToUpdate.setCategory(category);
        vehicleRepository.saveAndFlush(vehicleToUpdate);

    }
    @Override
    public GetVehicleResponse getById(int id) {
        Vehicle vehicleToId = vehicleRepository.findById(id).orElseThrow();
        GetVehicleResponse getVehicleResponse = new GetVehicleResponse();
        getVehicleResponse.setBrand(vehicleToId.getBrand());
        getVehicleResponse.setYear(vehicleToId.getYear());
        getVehicleResponse.setModel(vehicleToId.getModel());
        return getVehicleResponse;
    }
    @Override
    public List<GetAllVehiclesResponse> getAll() {
       return vehicleRepository
               .findAll()
               .stream()
               .map(vehicle -> new GetAllVehiclesResponse(vehicle.getId(),vehicle.getBrand(),vehicle.getModel(),vehicle.getYear(),vehicle.getCategory().getId())).toList();

    }





}
