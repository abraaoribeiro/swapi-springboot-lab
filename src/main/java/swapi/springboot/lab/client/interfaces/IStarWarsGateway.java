package swapi.springboot.lab.client.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.model.PeopleModel;

@FeignClient(url = "${app.feign.config.url}", name="starwars")
public interface IStarWarsGateway {

    @GetMapping(value = "/people")
    BaseModel<PeopleModel> findAllPeople();

    @GetMapping(value = "/people/{id}")
    PeopleModel findAByIdPeople(@PathVariable("id") Long id);

    @GetMapping(value = "/films")
    BaseModel<FilmModel> findAllFilm();

    @GetMapping(value = "/films/{id}")
    FilmModel findByIdFilm(@RequestParam Long id);


}
