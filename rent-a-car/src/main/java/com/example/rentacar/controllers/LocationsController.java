package com.example.rentacar.controllers;

import com.example.rentacar.entities.Location;
import com.example.rentacar.repositories.LocationRepository;
import com.example.rentacar.services.abstracts.LocationService;
import com.example.rentacar.services.dtos.location.request.AddLocationRequest;
import com.example.rentacar.services.dtos.location.request.UpdateLocationRequest;
import com.example.rentacar.services.dtos.location.response.GetLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("api/locations")
public class LocationsController {
    private final LocationService locationService;

    @GetMapping("{id}")
    public GetLocationResponse getById(int id){
        return locationService.getById(id);
    }

    @PostMapping
    public void add(@RequestBody AddLocationRequest addLocationRequest){
        locationService.add(addLocationRequest);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        locationService.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody UpdateLocationRequest updateLocationRequest){
        locationService.update(updateLocationRequest);

    }


}
