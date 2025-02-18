package com.electro.model.reponse.client;

import com.electro.model.enums.RewardType;
import lombok.Data;

import java.time.Instant;

@Data
public class ClientRewardLogResponse {
    private Long rewardLogId;
    private Instant rewardLogCreatedAt;
    private Integer rewardLogScore;
    private RewardType rewardLogType;
    private String rewardLogNote;
}
