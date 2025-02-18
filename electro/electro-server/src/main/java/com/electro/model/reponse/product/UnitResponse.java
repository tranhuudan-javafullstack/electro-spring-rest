package com.electro.model.reponse.product;

import lombok.Data;

import java.time.Instant;

@Data
public class UnitResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private Integer status;
}
