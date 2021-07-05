package swapi.springboot.lab.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import swapi.springboot.lab.client.interfaces.IStarWarsGateway;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.PeopleModel;
import swapi.springboot.lab.service.interfaces.IPeopleService;

@Service
@RequiredArgsConstructor
public class PeopleService implements IPeopleService {

    private final IStarWarsGateway starWarsGateway;

    @Override
    public BaseModel<PeopleModel> findAllPeople() {
        return this.starWarsGateway.findAllPeople();
    }

    @Override
    public PeopleModel findAByIdPeople(Long id) {
        return starWarsGateway.findAByIdPeople(id);
    }
}
