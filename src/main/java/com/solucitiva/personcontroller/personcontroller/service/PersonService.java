package com.solucitiva.personcontroller.personcontroller.service;

import com.solucitiva.personcontroller.personcontroller.DTO.PersonDTO;
import com.solucitiva.personcontroller.personcontroller.PersonMapper.PersonMapper;
import com.solucitiva.personcontroller.personcontroller.domain.Person;
import com.solucitiva.personcontroller.personcontroller.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PersonService {

    private PersonRepository repository;

    private final PersonMapper mapper = PersonMapper.INSTANCE;

    public List<PersonDTO> listAll(){

        List<Person> personList = this.repository.findAll();

        return personList.stream().map(mapper::toDTO)
                .collect(Collectors.toList());

    }

    public Optional<PersonDTO> findById(Long personId){

        Optional<Person> optionalPerson = this.repository.findById(personId);

        if(optionalPerson.isPresent()){
            return Optional.of(mapper.toDTO(optionalPerson.get()));
        }

        return Optional.empty();
    }

    public PersonDTO save(Person person){

        Person personSaved =  repository.save(person);
        return mapper.toDTO(personSaved);

    }

    public void delete(Long personId){

        repository.deleteById(personId);

    }



}
