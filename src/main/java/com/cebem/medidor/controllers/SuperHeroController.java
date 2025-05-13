package com.cebem.medidor.controllers;

import com.cebem.medidor.models.SuperheroCharacter;
import com.cebem.medidor.services.SuperheroService;

import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SuperHeroController {

    private final SuperheroService superheroService;

    @GetMapping("/superhero")
    public String getSuperhero(Model model) {
        SuperheroCharacter character = superheroService.getSuperheroCharacter();

        model.addAttribute("hero", character);
        // Devolver el nombre del template
        return "hero";
    }
}
