package com.cebem.medidor.services;

import com.cebem.medidor.models.SuperheroCharacter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SuperheroService {

    private final RestTemplate restTemplate;

    // Constructor que inyecta el RestTemplate
    public SuperheroService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Método para obtener un superhéroe aleatorio de la API de Superhéroes
    public SuperheroCharacter getSuperheroCharacter() {
        // URL base de la Superhero API con el ID del personaje
        String url = "https://superheroapi.com/api.php/02d33f8cc65758b7503c82ac0228ee7b/"
                + (int) (Math.random() * 730 + 1);

        try {
            // Realizamos la llamada GET a la API y mapeamos la respuesta al objeto
            // SuperheroCharacter
            return restTemplate.getForObject(url, SuperheroCharacter.class);
        } catch (Exception e) {
            // Si hay un error, lo mostramos en consola y devolvemos null
            e.printStackTrace();
            return null;
        }
    }
}
