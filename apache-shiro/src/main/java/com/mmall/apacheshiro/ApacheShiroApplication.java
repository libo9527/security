package com.mmall.apacheshiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.mmall.apacheshiro.mapper"})
public class ApacheShiroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApacheShiroApplication.class, args);
    }
}
