package com.electro.exception;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@AllArgsConstructor
@Data
public class ObjectNotValidException extends RuntimeException {
    private final Set<String> errors;
}
