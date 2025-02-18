package com.electro.model.request.inventory;

import com.electro.model.request.address.AddressRequest;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class DestinationRequest {
    @Nullable
    private String contactFullname;
    @Nullable
    private String contactEmail;
    @Nullable
    private String contactPhone;
    private AddressRequest address;
    private Integer status;
}
