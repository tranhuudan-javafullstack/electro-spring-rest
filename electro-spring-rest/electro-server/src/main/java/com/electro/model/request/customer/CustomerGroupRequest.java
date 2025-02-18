package com.electro.model.request.customer;

import lombok.Data;

@Data
public class CustomerGroupRequest {
    private String code;
    private String name;
    private String description;
    private String color;
    private Integer status;
}
