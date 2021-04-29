package com.tour.heroes.controller;

import com.tour.heroes.model.Hero;
import com.tour.heroes.repo.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Observable;

@RestController
@CrossOrigin
public class HeroController {

    @Autowired
    public HeroRepository heroRepository;

    @GetMapping("/hero")
    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello, "+name;
    }
}
