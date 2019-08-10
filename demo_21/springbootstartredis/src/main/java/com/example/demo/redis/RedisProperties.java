package com.example.demo.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host;
    private Integer prot;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getProt() {
        return prot;
    }

    public void setProt(Integer prot) {
        this.prot = prot;
    }
}
