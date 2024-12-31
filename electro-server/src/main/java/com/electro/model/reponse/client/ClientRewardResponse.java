package com.electro.model.reponse.client;

import lombok.Data;

import java.util.List;

@Data
public class ClientRewardResponse {
    private Integer rewardTotalScore;
    private List<ClientRewardLogResponse> rewardLogs;
}
