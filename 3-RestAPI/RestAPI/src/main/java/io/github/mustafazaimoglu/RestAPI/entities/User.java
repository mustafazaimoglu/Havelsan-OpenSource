package io.github.mustafazaimoglu.RestAPI.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    int userId;
    String name;
    String surname;
    String city;
    int salary;
}
