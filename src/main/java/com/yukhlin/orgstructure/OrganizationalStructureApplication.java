package com.yukhlin.orgstructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
@EnableTransactionManagement
public class OrganizationalStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationalStructureApplication.class, args);
    }

}

