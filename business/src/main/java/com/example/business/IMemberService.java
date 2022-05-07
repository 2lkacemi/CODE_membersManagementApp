package com.example.business;

import com.example.persistence.dto.MemberDto;

import java.util.List;

public interface IMemberService {

    MemberDto addMember(MemberDto memberDto);
    List<MemberDto> getAllMembers();
    MemberDto getMemberByEmail(String email);
    void removeMemberByEmail(String email);
    void updateMember(MemberDto member);


}