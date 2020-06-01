package com.wzh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wzh.*"})
@MapperScan("com.wzh.mapper")
public class EchartsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EchartsDemoApplication.class, args);
        System.out.println("启动成功");
    }

}
