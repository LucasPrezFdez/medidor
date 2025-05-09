package com.cebem.medidor.models;

import lombok.Data;

import java.util.List;

@Data
public class SuperheroCharacter {

    private String response;
    private String id;
    private String name;
    private Powerstats powerstats;
    private Biography biography;
    private Appearance appearance;
    private Work work;
    private Connections connections;
    private Image image;

    @Data
    public static class Powerstats {
        private String intelligence;
        private String strength;
        private String speed;
        private String durability;
        private String power;
        private String combat;
    }

    @Data
    public static class Biography {
        private String fullName;
        private String alterEgos;
        private List<String> aliases;
        private String placeOfBirth;
        private String firstAppearance;
        private String publisher;
        private String alignment;
    }

    @Data
    public static class Appearance {
        private String gender;
        private String race;
        private List<String> height;
        private List<String> weight;
        private String eyeColor;
        private String hairColor;
    }

    @Data
    public static class Work {
        private String occupation;
        private String base;
    }

    @Data
    public static class Connections {
        private String groupAffiliation;
        private String relatives;
    }

    @Data
    public static class Image {
        private String url;
    }
}
