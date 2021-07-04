package swapi.springboot.lab.model;

import lombok.Data;

@Data
public class BaseModel {
    private Integer count;
    private String next;
    private boolean previous;
}
