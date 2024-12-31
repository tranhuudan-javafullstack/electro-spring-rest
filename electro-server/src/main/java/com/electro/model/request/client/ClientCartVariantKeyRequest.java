package com.electro.model.request.client;

import lombok.Data;

@Data
public class ClientCartVariantKeyRequest {
    private Long cartId;
    private Long variantId;
}
