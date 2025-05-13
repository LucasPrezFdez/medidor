package com.cebem.medidor.controllers;

import com.cebem.medidor.models.SuperheroCharacter;
import com.cebem.medidor.services.SuperheroService;
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
    public ResponseEntity<?> getSuperhero() {
        SuperheroCharacter character = superheroService.getSuperheroCharacter();

        return ResponseEntity.ok(character);
    }
}
