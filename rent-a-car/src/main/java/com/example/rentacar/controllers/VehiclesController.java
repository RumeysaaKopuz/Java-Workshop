package com.example.rentacar.controllers;

import com.example.rentacar.services.abstracts.VehicleService;
import com.example.rentacar.services.dtos.vehicle.requests.AddVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.requests.UpdateVehicleRequest;
import com.example.rentacar.services.dtos.vehicle.responses.GetAllVehiclesResponse;
import com.example.rentacar.services.dtos.vehicle.responses.GetVehicleResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Single Responsibility
@RestController
@RequestMapping("api/vehicles")
public class VehiclesController {
// BAGIMLILIKLAR DAIMA SOYUT NESNELER UZERINDEN
    private VehicleService vehicleService;
    public VehiclesController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
    @PostMapping("/add")
    public String add(@RequestBody AddVehicleRequest request){
        vehicleService.add(request);
        return "Vehicle added";
    }

    @PostMapping("{id}")
    public void delete(@PathVariable int id){
        vehicleService.delete(id);
    }
    @PostMapping
    public void update(@RequestBody UpdateVehicleRequest updateVehicleRequest){
        vehicleService.update(updateVehicleRequest);
    }
    @GetMapping("{id}")
    public GetVehicleResponse getById(@PathVariable int id){
        return vehicleService.getById(id);
    }
    @GetMapping
    public List<GetAllVehiclesResponse> getAll(){
        return vehicleService.getAll();
    }


}