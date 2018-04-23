package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("hi");
        int x = 1+2;
        System.out.println(x);
        System.out.println(x*10);
        SpringApplication.run(DemoApplication.class, args);
    }
}
