package swapi.springboot.lab.service.interfaces;

import swapi.springboot.lab.model.PeopleModel;
import swapi.springboot.lab.model.dto.PeopleModelDTO;

public interface IPeopleService {

    PeopleModel<PeopleModelDTO> findAllPeople();

    PeopleModelDTO findAByIdPeople(Long id);


}
