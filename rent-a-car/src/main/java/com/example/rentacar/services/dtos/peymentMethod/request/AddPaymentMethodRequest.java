package com.example.rentacar.services.dtos.peymentMethod.request;

import lombok.Data;

@Data

public class AddPaymentMethodRequest {
    private String cardName;
    private String cardNumber;
    private String cvv;
}
