package com.electro.model.request.authentication;

import lombok.Data;

@Data
public class RoleRequest {
    private String code;
    private String name;
    private Integer status;
}
