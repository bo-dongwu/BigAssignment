package com.pbclwg.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author pouchine
 * @email 120L022131@stu.hit.edu.cn
 * @create 2022/11/19 16:32
 */

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                //配置路由
                .route("student_route1", r -> r.path("/")
                        .uri("http://localhost:9080"))
                .build();
    }
}
