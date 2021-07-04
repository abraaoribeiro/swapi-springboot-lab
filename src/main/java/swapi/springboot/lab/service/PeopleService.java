package swapi.springboot.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import swapi.springboot.lab.client.interfaces.IStarWarsGateway;
import swapi.springboot.lab.model.PeopleModel;
import swapi.springboot.lab.model.dto.PeopleModelDTO;
import swapi.springboot.lab.service.interfaces.IPeopleService;

@Service
@RequiredArgsConstructor
public class PeopleService implements IPeopleService {

    private final IStarWarsGateway starWarsGateway;

    @Override
    public PeopleModel<PeopleModelDTO> findAllPeople() {
        return this.starWarsGateway.findAllPeople();
    }

    @Override
    public PeopleModelDTO findAByIdPeople(Long id) {
        return starWarsGateway.findAByIdPeople(id);
    }
}
