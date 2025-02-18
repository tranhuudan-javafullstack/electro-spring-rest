package com.electro.model.reponse.product;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import org.springframework.lang.Nullable;

import java.time.Instant;

@Data
public class VariantResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private VariantResponse.ProductResponse product;
    private String sku;
    private Double cost;
    private Double price;
    @Nullable
    private JsonNode properties;
    private Integer status;

    @Data
    public static class ProductResponse {
        private Long id;
        private Instant createdAt;
        private Instant updatedAt;
        private String name;
        private String code;
        private String slug;
    }
}
