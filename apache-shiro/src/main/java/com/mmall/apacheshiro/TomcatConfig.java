package com.mmall.apacheshiro;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * @Description：
 * @Auther： libo
 * @date： 2018/11/19:22:54
 */
@Configuration
public class TomcatConfig {

    @Bean
    public TomcatServletWebServerFactory embeddedServletContainerFactory() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setDocumentRoot(new File("D:\\Users\\Administrator\\IdeaProjects\\DEMO\\security\\apache-shiro\\src\\main\\webapp"));
        return tomcat;
    }
}
