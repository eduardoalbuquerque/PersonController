package com.solucitiva.personcontroller.personcontroller.service;

import com.solucitiva.personcontroller.personcontroller.domain.Person;
import com.solucitiva.personcontroller.personcontroller.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PersonService {

    private PersonRepository repository;

    public List<Person> listAll(){
        return repository.findAll();
    }

    public Optional<Person> findById(Long personId){

        Optional personOptional = this.repository.findById(personId);

        if(personOptional.isPresent())
            return personOptional;

        return Optional.empty();
    }

    public Person save(Person person){
        return repository.save(person);
    }



}
