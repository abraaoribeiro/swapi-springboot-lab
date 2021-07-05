package swapi.springboot.lab.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class FilmModel{

    @JsonProperty("title")
    private String title;

    @JsonProperty("episode_id")
    private Long episodeId;

    @JsonProperty("opening_crawl")
    private String openingCrawl;

    @JsonProperty("director")
    private String director;

    @JsonProperty("producer")
    private String producer;

    @JsonProperty("release_date")
    private LocalDate releaseDate;

    @JsonProperty("characters")
    private List<String> characters;

    @JsonProperty("planets")
    private List<String> planets;

    @JsonProperty("starships")
    private List<String> starships;

    @JsonProperty("vehicles")
    private List<String> vehicles;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("created")
    private LocalDateTime created;

    @JsonProperty("edited")
    private LocalDateTime edited;

    @JsonProperty("url")
    private String url;

}
