package com.cebem.medidor.models;

import java.util.List;

import lombok.Data;

@Data
public class PokeRandom {

    public int id;
    public String name;
    public Sprites sprites;
    public List<TypeSlot> types;

    public static class Sprites {
        public String front_default;
    }

    public static class TypeSlot {
        public Type type;

        public static class Type {
            public String name;
        }
    }
}
