package com.example.persistence.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @ToString
@Table(name = "t_member")
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone_number", nullable = false)
    private String tel;

    @Column(name = "responsibility")
    private String responsibility;

    @Column(name = "executive_team")
    private Boolean executiveTeam;

    @Column(name = "promo", nullable = false)
    private String promo;

    @ManyToOne @JoinColumn(name="cell_id")
    private CellEntity cellEntity;



}