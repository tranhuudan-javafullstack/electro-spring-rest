package com.electro.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@OpenAPIDefinition(
//        info = @io.swagger.v3.oas.annotations.info.Info(
//                title = "Electro API",
//                version = "1.0.0",
//                description = "Electro API",
//                contact = @io.swagger.v3.oas.annotations.info.Contact(
//                        name = "Electro",
//                        email = "   ",
//                        url = "https://electro.com"
//                ),
//                license = @io.swagger.v3.oas.annotations.info.License(
//                        name = "Apache 2.0",
//                        url = "http://www.apache.org/licenses/LICENSE-2.0.html"
//                ),
//                termsOfService = "http://swagger.io/terms/"
//
//        ),
//        servers = {
//                @io.swagger.v3.oas.annotations.servers.Server(
//                        description = "Localhost",
//                        url = "http://localhost:8085 "
//                ),
//                @io.swagger.v3.oas.annotations.servers.Server(
//                        description = "Production",
//                        url = "https://electro.com"
//                )
//        },
//        security = {
//                @io.swagger.v3.oas.annotations.security.SecurityRequirement(
//                        name = "bearerAuth",
//                        scopes = {"global"}
//                )
//        }
//)
//@io.swagger.v3.oas.annotations.security.SecurityScheme(
//        name = "bearerAuth",
//        type = SecuritySchemeType.HTTP,
//        description = "JWT authorization of an API",
//        scheme = "bearer",
//        bearerFormat = "JWT",
//        in = SecuritySchemeIn.HEADER
//
//)
@Configuration
public class OpenApiConfiguration {


    @Bean
    public OpenAPI customOpenAPI() {
        Info info = new Info()
                .title("Electro API")
                .version("1.0.0")
                .description("Electro API")
                .contact(new Contact()
                        .name("Electro")
                        .url("https://electro.com")
                )
                .license(new io.swagger.v3.oas.models.info.License()
                        .name("Apache 2.0")
                        .url("http://www.apache.org/licenses/LICENSE-2.0.html")
                )
                .termsOfService("http://swagger.io/terms/");

        OpenAPI openAPI = new OpenAPI()
                .info(info)
                .addServersItem(new Server()
                        .description("Localhost")
                        .url("http://localhost:8085 ")
                )
                .addServersItem(new Server()
                        .description("Production")
                        .url("https://electro.com")
                );

        SecurityScheme securityScheme = new SecurityScheme()
                .name("bearerAuth")
                .type(SecurityScheme.Type.HTTP)
                .description("JWT authorization of an API")
                .scheme("bearer")
                .bearerFormat("JWT")
                .in(SecurityScheme.In.HEADER);

        openAPI.addSecurityItem(new SecurityRequirement().addList("bearerAuth", "global"));
        openAPI.components(new Components().addSecuritySchemes("bearerAuth", securityScheme));

        return openAPI;
    }

}