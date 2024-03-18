package com.cerus.informationsystemforhr.controllers;

import com.cerus.informationsystemforhr.models.Person;
import com.cerus.informationsystemforhr.services.PersonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/people/")
public class PersonController {
    private final PersonServiceImpl personService;

    public PersonController(PersonServiceImpl personService) {
        this.personService = personService;
    }

    @GetMapping
    public String peopleList (Model model){
        List<Person> people = personService.getAllPerson();
        model.addAttribute("people", people);
        return "people/peopleList";
    }

    @GetMapping("add-person")
    public String addPersonPage (@ModelAttribute("person") Person person){
        return "people/add_person";
    }

    @PostMapping("add-person-process")
    public String addPersonProcess(@ModelAttribute("person") Person person){
        personService.createPerson(person);
        return "redirect:/people/";
    }
}
