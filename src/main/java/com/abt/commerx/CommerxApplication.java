package com.abt.commerx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommerxApplication {

    private CommerxApplication() {
    }

    static void main(String[] args) {
        SpringApplication.run(CommerxApplication.class, args);
    }
}
