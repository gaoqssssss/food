package com.example.myfood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.myfood.dao")
public class MyfoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfoodApplication.class, args);
    }

}
