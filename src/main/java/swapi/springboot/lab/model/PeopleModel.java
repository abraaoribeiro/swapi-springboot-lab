package swapi.springboot.lab.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class PeopleModel{

    @JsonProperty("name")
    private String name;

    @JsonProperty("height")
    private double height;

    @JsonProperty("mass")
    private int mass;

    @JsonProperty("hair_color")
    private String hairColor;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("eye_color")
    private String eyeColor;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("homeworld")
    private String homeworld;

    @JsonProperty("films")
    private List<String> films;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("created")
    private LocalDateTime created;

    @JsonProperty("edited")
    private LocalDateTime edited;

    @JsonProperty("url")
    private String url;


}
