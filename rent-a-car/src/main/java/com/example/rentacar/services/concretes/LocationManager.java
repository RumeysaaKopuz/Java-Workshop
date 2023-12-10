 package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.Location;
import com.example.rentacar.repositories.LocationRepository;
import com.example.rentacar.services.abstracts.LocationService;
import com.example.rentacar.services.dtos.employee.response.GetEmployeeResponse;
import com.example.rentacar.services.dtos.location.request.AddLocationRequest;
import com.example.rentacar.services.dtos.location.request.UpdateLocationRequest;
import com.example.rentacar.services.dtos.location.response.GetLocationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class LocationManager implements LocationService {
    private final LocationRepository locationRepository;

    @Override
    public void add(AddLocationRequest addLocationRequest){
       Location locationToAdd = new Location();
        locationToAdd.setPickUpLocation(addLocationRequest.getPickUpLocation());
        locationToAdd.setDropOffLocation(addLocationRequest.getPickUpLocation());
        locationRepository.save(locationToAdd);
   }

    @Override
    public void delete(int id) {
        Location locationToDelete = locationRepository.findById(id).orElseThrow();
        locationRepository.delete(locationToDelete);
    }

    @Override
    public void update(UpdateLocationRequest updateLocationRequest) {
        Location locationToUpdate = locationRepository.findById(updateLocationRequest.getId()).orElseThrow();
        locationToUpdate.setPickUpLocation(updateLocationRequest.getPickUpLocation());
        locationToUpdate.setDropOffLocation(updateLocationRequest.getDropOffLocation());
        locationRepository.save(locationToUpdate);
    }

    @Override
    public GetLocationResponse getById(int id) {
        Location locationToId = locationRepository.findById(id).orElseThrow();
        GetLocationResponse getLocationResponse = new GetLocationResponse();
        getLocationResponse.setId(locationToId.getId());
        getLocationResponse.setPickUpLocation(locationToId.getPickUpLocation());
        getLocationResponse.setDropOffLocation(locationToId.getDropOffLocation());
        return getLocationResponse;
    }

    @Override
    public List<GetLocationResponse> getAll() {
        return locationRepository
                .findAll()
                .stream()
                .map(location -> new GetLocationResponse(location.getId(),location.getPickUpLocation(),location.getDropOffLocation())).toList();


    }
}



