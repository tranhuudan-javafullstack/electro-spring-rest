package com.electro.model.request.waybill;

import com.electro.model.enums.RequiredNote;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.lang.Nullable;

// Reference: https://api.ghn.vn/home/docs/detail?id=103
@Data
public class GhnUpdateOrderRequest {
    @JsonProperty("order_code")
    private String orderCode;
    @JsonProperty("note")
    @Nullable
    private String note;
    @JsonProperty("required_note")
    private RequiredNote requiredNote;
}
