package swapi.springboot.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import swapi.springboot.lab.client.interfaces.IStarWarsGateway;
import swapi.springboot.lab.model.FilmModel;
import swapi.springboot.lab.model.dto.FilmModelDTO;
import swapi.springboot.lab.service.interfaces.IFilmService;

@Service
@RequiredArgsConstructor
public class FilmService implements IFilmService {

    private final IStarWarsGateway starWarsGateway;

    @Override
    public FilmModel<FilmModelDTO> findAllFilm() {
        return starWarsGateway.findAllFilm();
    }

    @Override
    public FilmModelDTO findByIdFilm(Long id) {
        return starWarsGateway.findByIdFilm(id);
    }
}
