package com.electro.model.request.inventory;

import lombok.Data;
import org.springframework.lang.Nullable;

@Data
public class TransferRequest {
    private String code;
    private DocketRequest exportDocket;
    private DocketRequest importDocket;
    @Nullable
    private String note;
}
