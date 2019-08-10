
package com.example.demo;

import com.example.demo.redis.EnableRedis;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * 自己开发一个springboot start的步骤
 * 1、新建一个项目
 * 2、需要一个配置类，配置类里面需要装配好需要提供出去的类
 * 3、
 * (1)使用@Enable,使用@Import导入需要装配的类
 * (2)/META-INF/spring.factories，在org.springframework.boot.autoconfigure.EnableAutoConfiguration装配需要装配的类
 *4、在使用的时候，只需要引入maven依赖，有配置的话，引入配置项就行了
 *
 */

//第一种方式
//@EnableRedis
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("id","51");
        System.out.println(jedis.get("id"));
        context.close();
    }

}
