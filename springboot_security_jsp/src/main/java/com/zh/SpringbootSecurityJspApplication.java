package com.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.zh.mapper")
@EnableGlobalMethodSecurity(securedEnabled=true)
public class SpringbootSecurityJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSecurityJspApplication.class, args);
    }

}
