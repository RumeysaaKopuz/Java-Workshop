package com.example.rentacar.controllers;

import com.example.rentacar.entities.PaymentMethod;
import com.example.rentacar.repositories.PaymentMethodRepository;
import com.example.rentacar.services.abstracts.PaymentMethodService;
import com.example.rentacar.services.dtos.peymentMethod.request.AddPaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.request.UpdatePaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.response.GetAllPaymentMethodResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("api/paymentMethods")
public class PaymentMethodsController {
    private final PaymentMethodService paymentMethodService;

    @GetMapping("/getAll")
    public List<GetAllPaymentMethodResponse> getAll() {
       return paymentMethodService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody AddPaymentMethodRequest request) {
        paymentMethodService.add(request);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
         paymentMethodService.delete(id);

    }

    @PutMapping("/update/{id}")
    public void update(UpdatePaymentMethodRequest updatePaymentMethodRequest){
       paymentMethodService.update(updatePaymentMethodRequest);
    }












}




