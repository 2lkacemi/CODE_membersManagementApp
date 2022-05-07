package com.example.persistence.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @ToString
public class UserDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String tel;
}
