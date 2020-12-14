package com.solucitiva.personcontroller.personcontroller.repository;

import com.solucitiva.personcontroller.personcontroller.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
