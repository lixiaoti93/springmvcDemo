package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 表明是一个springboot项目
 * SpringBootApplication 标注在那个类上面就说明是springboot项目的主配置类
 */
@SpringBootApplication
public class SpringBootHelloWorld {
    public static void main(String[] args) {
        //应用入口
        SpringApplication.run(SpringBootHelloWorld.class,args);

    }
}
