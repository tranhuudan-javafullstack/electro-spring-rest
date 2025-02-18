package com.electro.model.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.Instant;
import java.util.Map;

@Value
@Builder
@AllArgsConstructor
public class ErrorMessage {
    int statusCode;
    Instant timestamp;
    String message;
    String description;
    Map<String, String> details;

    public ErrorMessage(int statusCode, Instant timestamp, String message, String description) {
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
        this.details = null;
    }
}