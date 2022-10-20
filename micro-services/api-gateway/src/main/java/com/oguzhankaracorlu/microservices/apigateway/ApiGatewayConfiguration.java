package com.oguzhankaracorlu.microservices.apigateway;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

/**
 * @author oguzhan.karacorlu on 20.10.2022
 * @project api-gateway
 */
@Configuration
public class ApiGatewayConfiguration {
    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder routeLocatorBuilder){
        Function<PredicateSpec, Buildable<Route>> routeFunction = p -> p.path("/get").uri("http://httpbin.org:80");
        return routeLocatorBuilder.routes().route(routeFunction)
        .build();
    }
}
