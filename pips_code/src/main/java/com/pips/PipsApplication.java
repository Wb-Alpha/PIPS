package com.pips;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.pips.mapper")
public class PipsApplication {
    public static void main(String[] args) {
        SpringApplication.run(PipsApplication.class, args);
    }
}
