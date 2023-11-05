package com.movies.Movies.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class v1 {

    @GetMapping("")
    public String home(){
        return "Hola mundo";
    }
    
}
