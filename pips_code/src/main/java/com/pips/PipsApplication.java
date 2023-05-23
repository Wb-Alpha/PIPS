package com.pips;


import com.pips.mapper.UserMapper;
import com.pips.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;


@SpringBootApplication
@MapperScan("com.pips.mapper")
public class PipsApplication {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println(date);
        SpringApplication.run(PipsApplication.class, args);
    }
}
