package com.electro.model.request.product;

import com.electro.model.request.address.AddressRequest;
import lombok.Data;

@Data
public class SupplierRequest {
    private String displayName;
    private String code;
    private String contactFullname;
    private String contactEmail;
    private String contactPhone;
    private String companyName;
    private String taxCode;
    private String email;
    private String phone;
    private String fax;
    private String website;
    private AddressRequest address;
    private String description;
    private String note;
    private Integer status;
}
