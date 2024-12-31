package com.electro.model.reponse.general;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventInitiationResponse {
    private String eventSourceUuid;
}
