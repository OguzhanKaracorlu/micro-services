package com.oguzhankaracorlu.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author oguzhan.karacorlu on 20.10.2022
 * @project api-gateway
 */
@Configuration
public class ApiGatewayConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MyHeader", "MyURI")
                                .addRequestParameter("Param", "MyValue"))
                        .uri("http://httpbin.org:80"))
                .route(p -> p.path("/currency-exchange/**").uri("lb://currency-exchange"))
                .route(p -> p.path("/currency-convers/**").uri("lb://currency-convers"))
                .route(p -> p.path("/currency-convers-feign/**").uri("lb://currency-convers"))
                .route(p -> p.path("/currency-convers-new/**")
                        .filters(f -> f.rewritePath("currency-convers-new/(?<segment>.*)",
                                "currency-convers-feign/${segment}"))
                        .uri("lb://currency-convers"))
        .build();
    }
}
