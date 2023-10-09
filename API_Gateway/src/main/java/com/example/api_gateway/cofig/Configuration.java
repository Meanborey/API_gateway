package com.example.api_gateway.cofig;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("product-service", r -> r
                        .path("/product")
                        .uri("http://product-service:8081"))
                .route("user-service", r -> r
                        .path("/user")
                        .uri("http://user-service:8085"))
                .route("service-order", r -> r
                        .path("/order")
                        .uri("http://localhost:8082")) // Replace with the actual URL of your Order Service

                .build();
    }

}
