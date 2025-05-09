package com.cebem.medidor.controllers;

import com.cebem.medidor.models.SuperheroCharacter;
import com.cebem.medidor.services.SuperheroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SuperHeroController {

    private final SuperheroService superheroService;

    @GetMapping("/hero")
    public String getHeroCard(Model model) {
        // Llamamos al servicio para obtener un superhéroe aleatorio
        SuperheroCharacter superheroCharacter = superheroService.getSuperheroCharacter();

        if (superheroCharacter == null) {
            // Si no conseguimos un superhéroe, redirigimos a la página de error
            return "error";
        }

        // Pasamos el objeto superheroCharacter a la vista
        model.addAttribute("hero", superheroCharacter);
        return "hero"; // Renderiza el template hero.html
    }
}
