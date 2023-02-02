package com.microsoft.azure.msalwebsample;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/** Microsfot OAuth2 테스트 */
@EnableWebSecurity // Spring Security를 활성화 시킵니다.
@Configuration
public class SecurityConfigForAzure {
    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
          //Disable Spring's basic security settings as they are not relevant for this sample
          // 이 샘플과 관계가 없으므로 disable 처리합니다. 
          http.httpBasic().disable();
          return http.build();
    }
    
}///~SecurityConfigForAzure
