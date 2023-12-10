package com.example.rentacar.services.dtos.peymentMethod.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetPaymentMethodResponse {
    private int id;
    private String cardName;
    private String cardNumber;
    private String cvv;
}
