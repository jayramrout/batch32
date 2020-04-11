package jrout.tutorial.springbootrest.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
public class Actor {
    private int actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

}
