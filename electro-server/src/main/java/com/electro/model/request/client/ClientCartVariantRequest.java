package com.electro.model.request.client;

import lombok.Data;

@Data
public class ClientCartVariantRequest {
    private Long variantId;
    private Integer quantity;
}
