package org.benjamin.benson.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.benjamin.benson.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BensonController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/")
    public String index() {

        return "Greetings from Benson! " + repository.findById(1).getFirstName();
    }

}
