package com.solucitiva.personcontroller.personcontroller.PersonMapper;

import com.solucitiva.personcontroller.personcontroller.DTO.PersonDTO;
import com.solucitiva.personcontroller.personcontroller.domain.Person;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    Person toEntity(PersonDTO personDTO);
    PersonDTO toDTO(Person person);

}
