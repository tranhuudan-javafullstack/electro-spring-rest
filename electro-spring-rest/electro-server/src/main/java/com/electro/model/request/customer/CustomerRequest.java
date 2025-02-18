package com.electro.model.request.customer;

import com.electro.model.request.authentication.UserRequest;
import lombok.Data;

@Data
public class CustomerRequest {
    private UserRequest user;
    private Long customerGroupId;
    private Long customerStatusId;
    private Long customerResourceId;
}
