package com.electro.model.reponse.product;

import com.electro.model.reponse.address.AddressResponse;
import lombok.Data;

import java.time.Instant;

@Data
public class SupplierResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
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
    private AddressResponse address;
    private String description;
    private String note;
    private Integer status;
}
