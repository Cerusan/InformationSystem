package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Person;

import java.util.List;

public interface PersonService {

    /**
     * Метод создания нового объекта класса Person
     * @param person
     */
    void createPerson(Person person);

    /**
     * Метод удаления существующего объекта класса Person
     * @param id
     */
    void deletePerson(int id);

    /**
     * Метод обновления существующего объекта класса Person
     * @param id
     * @param personUpdate
     */
    void updatePerson(int id, Person personUpdate);

    /**
     * Метод получения существующего объекта класса Person по его id
     * @param id
     * @return
     */
    Person getPersonById(int id);

    /**
     * Метод получения существующего объекта класса Person по значению его поля name
     * @param name
     * @return
     */
    List<Person> getPersonByName(String name);

    /**
     * Метод получения существующего объекта класса Person по значению его поля surname
     * @param surname
     * @return
     */
    List<Person> getPersonBySurname(String surname);

    List<Person> getPersonByDepartment(String department);

    /**
     * Метод получения всех существующих объектов класса Person
     * @return
     */
    List<Person> getAllPerson();
}
