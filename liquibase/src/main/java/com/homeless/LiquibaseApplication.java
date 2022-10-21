package com.homeless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiquibaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiquibaseApplication.class, args);
        System.out.println("|```````````````````````|\n" +
                           "|       Liquibase       |\n" +
                           "|.......................|\n" +
                           "       \\ (•◡•) /        \n" +
                           "        \\     /         \n" +
                           "           ——            \n" +
                           "         |    |          \n" +
                           "         |_   |_         ");

    }
}
