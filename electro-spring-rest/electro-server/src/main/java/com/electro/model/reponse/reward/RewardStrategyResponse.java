package com.electro.model.reponse.reward;

import com.electro.model.enums.RewardType;
import lombok.Data;

import java.time.Instant;

@Data
public class RewardStrategyResponse {
    private Long id;
    private Instant createdAt;
    private Instant updatedAt;
    private String name;
    private RewardType code;
    private String formula;
    private Integer status;
}
