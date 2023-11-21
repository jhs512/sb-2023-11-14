package com.ll.sb20231114.global.initData;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotProd {
    @Bean
    public ApplicationRunner initNotProd() {
        return args -> {
            System.out.println("안녕");
        };
    }
}
