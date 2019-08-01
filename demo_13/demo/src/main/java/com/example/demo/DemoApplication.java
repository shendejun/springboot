package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @SpringBootApplication 默认扫描的包的路径是当前包以及包下面的所有类，可以通过scanBasePackages 修改扫描包的路径
 *
 * 排查制定的类、配置类
 * exclude 根据class来排查
 * excludeName 根据class name来排查
 *
 * SpringApplication.setBannerMode(Banner.Mode.OFF);关闭输出banner
 * 自定义banner方法
 * 在classpath下放一个banner.txt的文件即可
 * banner.location 配置项来制定文字在banner的文件路径
 * banner.charset 配置项用来制定banner的编码，默认UTF-8
 *
 * springboot支持图片的banner，提供格式支持jpg,png,gif
 * banner.inamge.location 配置项用来制定banner的文件路径
 *
 */
@SpringBootApplication(scanBasePackages = "com.example.demo",excludeName = "")
public class DemoApplication {

    /**
     * 配置项中不存在时，使用默认值
     */
    @Value("${server.host:localhost}")
    private String serverHost;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = app.run(args);
        context.close();
    }

}
