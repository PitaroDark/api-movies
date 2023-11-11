package com.movies.Movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movies.Movies.services.V1Services;

@RestController
@RequestMapping("v1")
public class V1Controller {

    private V1Services services;

    V1Controller() {
        services = new V1Services();
    }

    @GetMapping("")
    public String home(){
        services.getX();
        return "Hola mundo";
    }
    
}
