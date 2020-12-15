package com.solucitiva.personcontroller.personcontroller.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PersonDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
}
