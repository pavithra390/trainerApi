package com.example.trainerapi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.models.GroupedOpenApi;
import io.swagger.v3.oas.models.info.Info;
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi httpApi() {
        return GroupedOpenApi.builder()
                .group("http")
                .pathsToMatch("/gym/**")
                .build();
    }
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info().title("Spring Boot-API").version("1.0.0"));
    }

//http://localhost:3001/swagger-ui/index.html
}
