package com.tx.zhcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tx.zhcrm.mapper")
public class ZhCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhCrmApplication.class, args);
    }

}
