package com.electro.model.reponse.customer;

import lombok.Data;

import java.time.Instant;

@Data
public class CustomerResourceResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String code;
    private String name;
    private String description;
    private String color;
    private Integer status;
}
