package swapi.springboot.lab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swapi.springboot.lab.model.dto.PeopleModelDTO;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PeopleModel<T> extends BaseModel {

    private List<PeopleModelDTO> results;

}
