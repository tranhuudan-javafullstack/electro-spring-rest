package com.electro.model.request.client;

import com.electro.model.enums.PaymentMethodType;
import lombok.Data;

@Data
public class ClientSimpleOrderRequest {
    private PaymentMethodType paymentMethodType;
}
