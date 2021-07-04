package swapi.springboot.lab.service.interfaces;

import org.springframework.web.bind.annotation.RequestParam;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.model.dto.FilmModelDTO;

public interface IFilmService {

    FilmModel<FilmModelDTO> findAllFilm();

    FilmModelDTO findByIdFilm(@RequestParam Long id);
}
