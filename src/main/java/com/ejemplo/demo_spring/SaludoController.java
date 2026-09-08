package com.ejemplo.demo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/saludar")
    public String saludar() {
        return "¡Hola! Mi primer proyecto Spring Boot está en línea y funcionando.";
    }
}