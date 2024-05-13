package com.example.project130520241;

import jakarta.persistence.*;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String firstName;

    @Getter @Setter
    private String lastName;

    @Getter @Setter
    private String job;
}
