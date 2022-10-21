package com.homeless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlywayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlywayApplication.class, args);
        System.out.println("|```````````````````````|\n" +
                           "|   flyway-migration    |\n" +
                           "|.......................|\n" +
                           "       \\ (•◡•) /        \n" +
                           "        \\     /         \n" +
                           "           ——            \n" +
                           "         |    |          \n" +
                           "         |_   |_         ");

    }
}
