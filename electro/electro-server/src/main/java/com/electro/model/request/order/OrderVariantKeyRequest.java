package com.electro.model.request.order;

import lombok.Data;

@Data
public class OrderVariantKeyRequest {
    private Long orderId;
    private Long variantId;
}
