package com.example.persistence.dto;

import com.example.persistence.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @ToString
public class MemberDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String tel;
    private String responsibility;
    private Boolean executiveTeam;
    private String promo;
    private CellDto cellDto;

}
