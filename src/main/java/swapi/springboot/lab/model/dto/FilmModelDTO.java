package swapi.springboot.lab.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FilmModelDTO {

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
    private LocalDate realaseDate;


}
