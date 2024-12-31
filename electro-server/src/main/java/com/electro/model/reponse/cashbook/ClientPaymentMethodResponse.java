package com.electro.model.reponse.cashbook;

import com.electro.model.enums.PaymentMethodType;
import lombok.Data;

@Data
public class ClientPaymentMethodResponse {
    private Long paymentMethodId;
    private String paymentMethodName;
    private PaymentMethodType paymentMethodCode;
}
