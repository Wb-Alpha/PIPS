package com.pips;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.IOException;
import java.util.Date;


@SpringBootApplication
@MapperScan("com.pips.mapper")
public class PipsApplication {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(PipsApplication.class, args);
    }
}
