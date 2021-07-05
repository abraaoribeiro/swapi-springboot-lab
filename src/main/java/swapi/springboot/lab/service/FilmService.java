package swapi.springboot.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import swapi.springboot.lab.client.interfaces.IStarWarsGateway;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.service.interfaces.IFilmService;

@Service
@RequiredArgsConstructor
public class FilmService implements IFilmService {

    private final IStarWarsGateway starWarsGateway;

    @Override
    public BaseModel<FilmModel> findAllFilm() {
        return starWarsGateway.findAllFilm();
    }

    @Override
    public FilmModel findByIdFilm(Long id) {
        return starWarsGateway.findByIdFilm(id);
    }
}
