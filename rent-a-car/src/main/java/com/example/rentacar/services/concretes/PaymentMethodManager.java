 package com.example.rentacar.services.concretes;

import com.example.rentacar.entities.PaymentMethod;
import com.example.rentacar.repositories.PaymentMethodRepository;
import com.example.rentacar.services.abstracts.PaymentMethodService;
import com.example.rentacar.services.dtos.employee.response.GetEmployeeResponse;
import com.example.rentacar.services.dtos.peymentMethod.request.AddPaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.request.UpdatePaymentMethodRequest;
import com.example.rentacar.services.dtos.peymentMethod.response.GetAllPaymentMethodResponse;
import com.example.rentacar.services.dtos.peymentMethod.response.GetPaymentMethodResponse;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class PaymentMethodManager implements PaymentMethodService {
    private final PaymentMethodRepository paymentMethodRepository;

    @Override
    public void add(AddPaymentMethodRequest request){
        PaymentMethod paymentMethodToAdd = new PaymentMethod();
        paymentMethodToAdd.setCardNumber(request.getCardNumber());
        paymentMethodToAdd.setCardName(request.getCardName());
        paymentMethodToAdd.setCvv(request.getCvv());
        paymentMethodRepository.save(paymentMethodToAdd);
    }

    @Override
    public void update(UpdatePaymentMethodRequest updatePaymentMethodRequest){
        PaymentMethod paymentMethodToUpdate = paymentMethodRepository.findById(updatePaymentMethodRequest.getId()).orElseThrow();
        paymentMethodToUpdate.setCardNumber(updatePaymentMethodRequest.getCardNumber());
        paymentMethodToUpdate.setCardName(updatePaymentMethodRequest.getCardName());
        paymentMethodToUpdate.setCvv(updatePaymentMethodRequest.getCvv());
        paymentMethodRepository.saveAndFlush(paymentMethodToUpdate);
    }



    @Override
    public List<GetAllPaymentMethodResponse> getAll(){
        return paymentMethodRepository
                .findAll()
                .stream()
                .map(paymentMethod -> new GetAllPaymentMethodResponse(paymentMethod.getId(),paymentMethod.getCardName(),paymentMethod.getCardNumber(),paymentMethod.getCvv())).toList();


    }

    @Override
    public void delete(int id) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(id).orElseThrow();
        paymentMethodRepository.delete(paymentMethod);
    }

}
