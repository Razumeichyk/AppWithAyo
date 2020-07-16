package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private Integer id;
    private String password;
    private String firstName;
    private String lastName;

    public User(Integer id, String password) {
        this.id = id;
        this.password = password;
    }

    public User(Integer id, String password, String firstName, String lastName) {
        this.id = id;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
