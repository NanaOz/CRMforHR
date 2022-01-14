package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories(basePackages="repository")
@EnableTransactionManagement
@EntityScan(basePackages= "com/company/utils")
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }

}
