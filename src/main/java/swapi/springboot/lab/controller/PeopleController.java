package swapi.springboot.lab.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import swapi.springboot.lab.model.BaseModel;
import swapi.springboot.lab.model.PeopleModel;
import swapi.springboot.lab.service.interfaces.IPeopleService;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {

    private final IPeopleService peopleService;

    @GetMapping()
    public BaseModel<PeopleModel> findAll() {
        return this.peopleService.findAllPeople();
    }

    @GetMapping(value = "/{id}")
    public PeopleModel findAByIdPeople(@PathVariable("id") Long id) {
        return this.peopleService.findAByIdPeople(id);
    }

}
