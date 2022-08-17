package com.kob.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author August
 * @date 2022/8/17 - 15:17
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}