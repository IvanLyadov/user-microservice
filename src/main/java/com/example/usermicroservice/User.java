package com.example.usermicroservice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
}