package com.electro.model.reponse.client;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.Instant;

@Data
@Accessors(chain = true)
public class ClientWishResponse {
    private Long wishId;
    private Instant wishCreatedAt;
    private ClientListedProductResponse wishProduct;
}
