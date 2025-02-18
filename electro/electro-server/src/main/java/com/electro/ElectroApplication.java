package com.electro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//        (exclude = LiquibaseAutoConfiguration.class)
@EnableCaching
public class ElectroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElectroApplication.class, args);
    }

}
