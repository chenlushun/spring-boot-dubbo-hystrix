package com.alex.spring.boot.dubbo.provider;

import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
@EnableDubboConfiguration("com.alex")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

