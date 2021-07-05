package swapi.springboot.lab.service.interfaces;

import org.springframework.web.bind.annotation.RequestParam;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.FilmModel;

public interface IFilmService {

    BaseModel<FilmModel> findAllFilm();

    FilmModel findByIdFilm(@RequestParam Long id);
}
