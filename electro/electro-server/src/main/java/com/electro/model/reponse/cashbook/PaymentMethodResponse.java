package com.electro.model.reponse.cashbook;

import com.electro.model.enums.PaymentMethodType;
import lombok.Data;

import java.time.Instant;

@Data
public class PaymentMethodResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private PaymentMethodType code;
    private Integer status;
}
