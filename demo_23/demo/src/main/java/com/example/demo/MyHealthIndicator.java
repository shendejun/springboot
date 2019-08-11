package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 自定义系统健康状态监测
 */
@Component
public class MyHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        return Health.down().withDetail("error","spring boot error").build();
    }
}
