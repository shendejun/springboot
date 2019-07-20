package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 支持获取数组，集合
 * 配置方式为：name[index] = value
 */
@Component
@ConfigurationProperties(prefix = "ds")
public class TomcatProperties {

    /**
     * 集合
     */
    private List<String> hosts = new ArrayList<>();

    /**
     * 数组
     */
    private String[] ports;

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    @Override
    public String toString() {
        return "hosts:" + hosts+";ports:"+ Arrays.asList(ports);
    }
}
