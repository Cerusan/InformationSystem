package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Person;
import com.cerus.informationsystemforhr.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void createPerson(Person person) {
        Person newPerson = new Person(person.getName(), person.getSurname(), person.getFathername(),
                person.getAge(), person.getPost(), person.getDepartment(), person.getSkills(), person.getExperience(),
                person.getAcceptedAt());

        personRepository.save(newPerson);
    }

    @Override
    public void deletePerson(int id) {
        personRepository.deleteById(id);
    }

    @Override
    public void updatePerson(int id, Person personUpdate) {
        Person oldPerson = personRepository.findById(id).get();

        oldPerson.setName(personUpdate.getName());
        oldPerson.setSurname(personUpdate.getSurname());
        oldPerson.setFathername(personUpdate.getFathername());
        oldPerson.setAge(personUpdate.getAge());
        oldPerson.setPost(personUpdate.getPost());
        oldPerson.setDepartment(personUpdate.getDepartment());
        oldPerson.setSkills(personUpdate.getSkills());
        oldPerson.setExperience(personUpdate.getExperience());
        oldPerson.setAcceptedAt(personUpdate.getAcceptedAt());

        personRepository.save(oldPerson);
    }

    @Override
    public Person getPersonById(int id) {
        return personRepository.findById(id).get();
    }

    @Override
    public List<Person> getPersonByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public List<Person> getPersonBySurname(String surname) {
        return personRepository.findBySurname(surname);
    }

    @Override
    public List<Person> getPersonByDepartment(String department) {
        return personRepository.findByDepartment(department);
    }

    @Override
    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }
}
