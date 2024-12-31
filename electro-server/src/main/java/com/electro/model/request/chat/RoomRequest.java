package com.electro.model.request.chat;

import lombok.Data;

@Data
public class RoomRequest {
    private String name;
    private Long userId;
}
