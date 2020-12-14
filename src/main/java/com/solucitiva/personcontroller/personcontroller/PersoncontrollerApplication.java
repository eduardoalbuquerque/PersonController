package com.solucitiva.personcontroller.personcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PersoncontrollerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersoncontrollerApplication.class, args);
    }

}
