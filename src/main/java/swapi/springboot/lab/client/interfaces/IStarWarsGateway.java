package swapi.springboot.lab.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.model.PeopleModel;
import swapi.springboot.lab.model.dto.FilmModelDTO;
import swapi.springboot.lab.model.dto.PeopleModelDTO;

import javax.websocket.server.PathParam;

@FeignClient(url = "${app.feign.config.url}", name="starwars")
public interface IStarWarsGateway {

    @GetMapping(value = "/people")
    PeopleModel<PeopleModelDTO> findAllPeople();

    @GetMapping(value = "/people/{id}")
    PeopleModelDTO findAByIdPeople(@PathVariable("id") Long id);

    @GetMapping(value = "/films")
    FilmModel<FilmModelDTO> findAllFilm();

    @GetMapping(value = "/films/{id}")
    FilmModelDTO findByIdFilm(@RequestParam Long id);


}
