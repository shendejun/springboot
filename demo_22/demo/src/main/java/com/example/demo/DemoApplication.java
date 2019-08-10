package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * springboot默认的日志级别是info
 * 可以通过logging.level.*=debug 来设置,* 可以是包，也可以是某个类
 * 日志级别有7个，OFF级别表示关闭日志输出
 *
 * logging.file=C:/Users/Administrator/Desktop/log/my.log 指定日志文件名字
 * logging.path=C:/Users/Administrator/Desktop/log 指定日志文件的路径，默认为spring.log
 * 日志文件输出文件的大小10M之后，就会分割了
 *
 * #指定控制台日志输出格式
 * logging.pattern.console=%d{yyyy-MMM-dd HH} %-5level [%thread] %logger{15} - %msg%n
 * #指定日志输出到文件的格式
 * logging.pattern.file=%d{yyyy-MMM-dd HH:mm} %-5level [%thread] %logger{15} - %msg%n
 *
 * springboot默认支持logback
 * 也就是说，需要在classpath下放一个logback.xml,或者logback-spring.xml,即可定制日志的输出
 */
@SpringBootApplication(exclude = WebSocketServletAutoConfiguration.class)
public class DemoApplication {

    public static void main(String[] args) {
        //只输出内部的debug，并不输出我们自己的debug
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, "--debug=true");
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        context.getBean(UserDao.class).log();
        context.getBean(UserService.class).log();
        context.close();
    }

}
