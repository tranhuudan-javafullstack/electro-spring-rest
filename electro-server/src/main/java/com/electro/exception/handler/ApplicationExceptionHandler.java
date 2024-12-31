package com.electro.exception.handler;

import com.electro.exception.*;
import com.electro.model.common.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler({AccessDeniedException.class, RefreshTokenException.class})
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    public ErrorMessage accessDeniedException(AccessDeniedException ex, WebRequest request) {
        return new ErrorMessage(HttpStatus.FORBIDDEN.value(), Instant.now(), ex.getMessage(), request.getDescription(false));
    }

    @ExceptionHandler({AuthenticationException.class, VerificationException.class, ExpiredTokenException.class})
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    public ErrorMessage authenticationException(AuthenticationException ex, WebRequest request) {
        return new ErrorMessage(HttpStatus.UNAUTHORIZED.value(), Instant.now(), ex.getMessage(), request.getDescription(false));
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        return new ErrorMessage(HttpStatus.NOT_FOUND.value(), Instant.now(), ex.getMessage(), request.getDescription(false));
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage globalExceptionHandler(Exception ex, WebRequest request) {
        return new ErrorMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(), Instant.now(), ex.getMessage(), request.getDescription(false));
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMessage handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return ErrorMessage.builder().statusCode(HttpStatus.BAD_REQUEST.value()).timestamp(Instant.now()).message("Validation failed").description(errors.toString()).details(errors).build();
    }

}
