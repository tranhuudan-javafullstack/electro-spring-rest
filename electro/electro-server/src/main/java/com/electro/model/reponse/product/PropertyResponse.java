package com.electro.model.reponse.product;

import lombok.Data;

import java.time.Instant;

@Data
public class PropertyResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private String code;
    private String description;
    private Integer status;
}
