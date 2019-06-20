package top.alertcode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
public class Person {

    private String lastName;
    private String firstName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}