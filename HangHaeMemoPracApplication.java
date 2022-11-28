package com.example.hanghaememoprac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HangHaeMemoPracApplication {

    public static void main(String[] args) {
        SpringApplication.run(HangHaeMemoPracApplication.class, args);
    }

}
