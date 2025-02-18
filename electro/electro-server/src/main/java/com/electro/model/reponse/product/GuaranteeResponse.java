package com.electro.model.reponse.product;

import lombok.Data;

import java.time.Instant;

@Data
public class GuaranteeResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private String description;
    private Integer status;
}
