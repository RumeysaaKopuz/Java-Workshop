package com.example.rentacar.services.abstracts;

import com.example.rentacar.entities.PaymentMethod;
import com.example.rentacar.services.dtos.peymentMethod.request.AddPaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.request.UpdatePaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.response.GetAllPaymentMethodResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentMethodService{
    void add(AddPaymentMethodRequest request);
    void update(UpdatePaymentMethodRequest updatePaymentMethodRequest);
    List<GetAllPaymentMethodResponse> getAll();
    void delete(int id);
}
