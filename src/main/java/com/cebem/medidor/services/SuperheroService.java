package com.cebem.medidor.services;

import com.cebem.medidor.models.SuperheroCharacter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class SuperheroService {

    private static final Logger logger = LoggerFactory.getLogger(SuperheroService.class);
    private final RestTemplate restTemplate;

    public SuperheroService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public SuperheroCharacter getSuperheroCharacter() {
        int id = ThreadLocalRandom.current().nextInt(1, 731);
        String url = "https://superheroapi.com/api/02d33f8cc65758b7503c82ac0228ee7b/" + id;

        try {
            logger.info("Consultando superhéroe con ID: {}", id);
            SuperheroCharacter character = restTemplate.getForObject(url, SuperheroCharacter.class);
            if (character == null) {
                logger.warn("Respuesta nula para el ID: {}", id);
            }
            return character;
        } catch (Exception e) {
            logger.error("Error al obtener el superhéroe con ID {}: {}", id, e.getMessage());
            return null;
        }
    }
}