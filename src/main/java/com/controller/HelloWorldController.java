package com.controller;

import com.beans.MyBean;
import com.models.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.repositories.ExampleRepository;

@RestController
@RequestMapping(path = "/demo")
public class HelloWorldController {

    @Autowired
    private ExampleRepository exampleRepository;

    @Autowired
    private MyBean myBean;

    @RequestMapping("/all")
    public Iterable<Example> index() {
        return exampleRepository.findAll();
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    @Transactional
    public @ResponseBody String addNewUser () {
        Example n = new Example();
        n.setName("1234");
        exampleRepository.save(n);
        return "Saved";
    }

}
