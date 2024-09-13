package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/propietarios")
public class Propietarios {
    
    @GetMapping("/list")
    public String listPeliculas(){
        return "propeitarios";
    }
}
