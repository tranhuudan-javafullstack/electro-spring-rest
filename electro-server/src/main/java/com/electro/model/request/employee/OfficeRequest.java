package com.electro.model.request.employee;

import com.electro.model.request.address.AddressRequest;
import lombok.Data;

@Data
public class OfficeRequest {
    private String name;
    private AddressRequest address;
    private Integer status;
}
