package com.cebem.medidor.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cebem.medidor.models.PokeRandom;

import java.util.Random;

@Service
public class PokemonService {

    private final RestTemplate restTemplate;
    private final int MAX_POKEMON_ID = 1025;

    public PokemonService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PokeRandom getRandomPokemon() {
        int randomId = new Random().nextInt(MAX_POKEMON_ID) + 1;
        String url = "https://pokeapi.co/api/v2/pokemon/" + randomId;

        return restTemplate.getForObject(url, PokeRandom.class);
    }
}