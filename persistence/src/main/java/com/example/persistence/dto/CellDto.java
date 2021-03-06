package com.example.persistence.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data @NoArgsConstructor @ToString
public class CellDto {

    private long id;
    private String cellRef;
    private String cellName;
    private String cellDescription;

    private List<MemberDto> memberDtoList = new ArrayList<>();

}