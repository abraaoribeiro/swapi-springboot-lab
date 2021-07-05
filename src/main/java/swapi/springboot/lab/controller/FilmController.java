package swapi.springboot.lab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.service.interfaces.IFilmService;

@RestController
@RequestMapping("/films")
@RequiredArgsConstructor
public class FilmController {

    private final IFilmService filmService;

    @GetMapping
    private BaseModel<FilmModel> findAllFilm(){
       return this.filmService.findAllFilm();
    }

    @GetMapping(value = "/{id}")
    private FilmModel findByIdFilm(@PathVariable("id") Long id){
       return this.filmService.findByIdFilm(id);
    }
}
