package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/propietario")
public class Propietarios {
    
    @GetMapping("/list")
    public String listPropietarios(){
        return "propietarios";
    }
}
