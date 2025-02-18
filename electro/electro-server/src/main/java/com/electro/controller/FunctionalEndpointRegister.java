package com.electro.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
@RequiredArgsConstructor
public class FunctionalEndpointRegister {

    private final HandlerFunctions handlers;

    @Bean
    public RouterFunction<ServerResponse> register() {
        return RouterFunctions.route()
                .GET("/api/test/1", handlers::returnText)
                .GET("/api/test/2", handlers::returnParamsMap)
                .GET("/api/test/3", handlers::callWikipediaApi)
                .build();
    }

}
