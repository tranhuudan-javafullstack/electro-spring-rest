package com.electro.model.request.authentication;

import lombok.Data;

@Data
public class ResetPasswordRequest {
    private String token;
    private String email;
    private String password;
}
