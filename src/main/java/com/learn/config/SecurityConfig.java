package com.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector)
            throws Exception {
        http.csrf((csrf) -> csrf.disable())
                .authorizeHttpRequests((request) -> request.anyRequest().permitAll());

        http.headers(headersConfigurer -> headersConfigurer
                .frameOptions(frameOptionsConfig -> frameOptionsConfig.disable()));

        return http.build();
    }
}
