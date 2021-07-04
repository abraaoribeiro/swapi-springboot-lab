package swapi.springboot.lab.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import swapi.springboot.lab.model.dto.FilmModelDTO;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FilmModel<T> extends BaseModel {

    private List<FilmModelDTO> results;

}
