package swapi.springboot.lab.model;

import lombok.Data;

import java.util.List;

@Data
public class BaseModel<T> {
    private Integer count;
    private String next;
    private boolean previous;
    private List<T> results;
}
