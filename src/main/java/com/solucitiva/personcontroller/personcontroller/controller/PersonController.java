package com.solucitiva.personcontroller.personcontroller.controller;

import com.solucitiva.personcontroller.personcontroller.domain.Person;
import com.solucitiva.personcontroller.personcontroller.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService service;

    @GetMapping
    public ResponseEntity<List<Person>> listAll(){
        return ResponseEntity.ok().body(service.listAll());
    }

    @GetMapping("/{personId}")
    public ResponseEntity<Person> findById(@PathVariable Long personId){

        var personOptional = this.service.findById(personId);

        if(personOptional.isPresent())
            return ResponseEntity.ok(personOptional.get());

        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok().body(service.save(person));

    }

//    @DeleteMapping("/{personId}")
//    public ResponseEntity<?> delete(@PathVariable Long personId){
//        Person personToDelete =
//    }

}
