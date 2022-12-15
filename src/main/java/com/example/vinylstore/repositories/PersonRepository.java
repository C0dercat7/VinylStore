package com.example.vinylstore.repositories;

import com.example.vinylstore.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Integer> {

    Optional<Person> findByLogin(String login);

}
