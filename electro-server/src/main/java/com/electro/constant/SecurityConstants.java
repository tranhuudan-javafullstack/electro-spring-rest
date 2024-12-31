package com.electro.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SecurityConstants {
    ADMIN_API_PATHS(new String[]{"/api/auth/info"}),
    CLIENT_API_PATHS(new String[]{
            "/client-api/users/**",
            "/client-api/wishes/**",
            "/client-api/preorders/**",
            "/client-api/notifications/**",
            "/client-api/reviews/**",
            "/client-api/carts/**",
            "/client-api/orders/**",
            "/client-api/chat/**"
    }),
    IGNORING_API_PATHS(new String[]{
            "/client-api/notifications/events",
            "/client-api/reviews/products/**",
            "/client-api/orders/success",
            "/client-api/orders/cancel",
            "/swagger-resources/**",
            "/swagger-ui/**",
            "/v3/api-docs/**",
            "/webjars/**",
            "/v2/api-docs",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/swagger-ui/**",
            "/swagger-resources"
    });

    @AllArgsConstructor
    @Getter
    public enum Role {
        ADMIN("ADMIN"),
        EMPLOYEE("EMPLOYEE"),
        CUSTOMER("CUSTOMER");

        private String role;

    }

    private String[] paths;

}
