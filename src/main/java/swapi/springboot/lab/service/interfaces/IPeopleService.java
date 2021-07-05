package swapi.springboot.lab.service.interfaces;

import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.PeopleModel;

public interface IPeopleService {

    BaseModel<PeopleModel> findAllPeople();

    PeopleModel findAByIdPeople(Long id);


}
