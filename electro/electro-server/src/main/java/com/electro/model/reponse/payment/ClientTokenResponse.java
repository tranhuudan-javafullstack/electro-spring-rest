package com.electro.model.reponse.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClientTokenResponse {
    @JsonProperty("client_token")
    private String clientToken;
    @JsonProperty("expires_in")
    private Long expiresIn;
}
