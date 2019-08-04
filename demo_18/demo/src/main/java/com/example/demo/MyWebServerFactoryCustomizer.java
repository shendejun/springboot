package com.example.demo;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class MyWebServerFactoryCustomizer implements WebServerFactoryCustomizer {
    @Override
    public void customize(WebServerFactory factory) {
        TomcatServletWebServerFactory tomcat = (TomcatServletWebServerFactory)factory;
        tomcat.setPort(8081);
        tomcat.setBaseDirectory(new File("F:/code/gitHub/springboot/demo_18/tomcat"));
        //添加日志配置
        tomcat.addContextValves(getAccessLogValve());
        //添加连接器配置
        tomcat.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
    }

    private AccessLogValve getAccessLogValve(){
        AccessLogValve log = new AccessLogValve();
        log.setDirectory("F:/code/gitHub/springboot/demo_18/logs_2");
        log.setEnabled(true);
        log.setPattern("common");
        log.setPrefix("springboot-access-log");
        log.setSuffix(".txt");
        return log;
    }
}

class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer{

    @Override
    public void customize(Connector connector) {
        Http11NioProtocol protocol =(Http11NioProtocol)connector.getProtocolHandler();
        //设置最多连接数
        protocol.setMaxConnections(2000);
        //设置最大线程数
        protocol.setMaxThreads(500);

    }
}