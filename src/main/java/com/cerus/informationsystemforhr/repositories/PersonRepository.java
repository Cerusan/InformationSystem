package com.cerus.informationsystemforhr.repositories;

import com.cerus.informationsystemforhr.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);

    List<Person> findBySurname(String surname);

    List<Person> findByDepartment(String department);
}
