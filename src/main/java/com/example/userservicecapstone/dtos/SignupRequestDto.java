package com.example.userservicecapstone.dtos;

import lombok.Getter;
import lombok.Setter;

//Use getters and setters with Dtos also
@Getter
@Setter
public class SignupRequestDto {
    private String name;
    private String email;
    private String password;
}
