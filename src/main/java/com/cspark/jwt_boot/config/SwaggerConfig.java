package com.cspark.jwt_boot.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

import lombok.RequiredArgsConstructor;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "Spring Boot REST API Specifications",
                description = "Specification",
                version = "1.0.0"))
@SecurityScheme(
        name = "Bearer Authentication",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@RequiredArgsConstructor
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi openAPI() {
        String[] paths = {"/**"};

        return GroupedOpenApi.builder()
                .group("Spring Boot REST API")
                .pathsToMatch(paths)
                .build();
    }

//    @Bean
//    public OpenAPI openAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("Spring Boot REST API Specifications")
//                        .description("Specification")
//                        .version("1.0.0"))
//                .components(new Components()
//                        .addSecuritySchemes("bearer-key",
//                                new io.swagger.v3.oas.models.security.SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT")
//                        )
//                );
//                ;
//    }

}