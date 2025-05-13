package com.cebem.medidor.models;

import com.fasterxml.jackson.annotation.JsonProperty;
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
        @JsonProperty("full-name")
        private String fullName;

        @JsonProperty("alter-egos")
        private String alterEgos;

        private List<String> aliases;

        @JsonProperty("place-of-birth")
        private String placeOfBirth;

        @JsonProperty("first-appearance")
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

        @JsonProperty("eye-color")
        private String eyeColor;

        @JsonProperty("hair-color")
        private String hairColor;
    }

    @Data
    public static class Work {
        private String occupation;
        private String base;
    }

    @Data
    public static class Connections {
        @JsonProperty("group-affiliation")
        private String groupAffiliation;

        private String relatives;
    }

    @Data
    public static class Image {
        private String url;
    }
}