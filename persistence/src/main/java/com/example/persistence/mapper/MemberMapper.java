package com.example.persistence.mapper;

import com.example.persistence.dto.MemberDto;
import com.example.persistence.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {


    /**
     * member mapper
     */
    public MemberEntity mapToMemberEntity(MemberDto memberDto){
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setId(memberDto.getId());
        memberEntity.setFirstName(memberDto.getFirstName());
        memberEntity.setLastName(memberDto.getLastName());
        memberEntity.setEmail(memberDto.getEmail());
        memberEntity.setExecutiveTeam(memberDto.getExecutiveTeam());
        memberEntity.setResponsibility(memberDto.getResponsibility());
        memberEntity.setPromo(memberDto.getPromo());
        memberEntity.setTel(memberDto.getTel());

        return memberEntity;
    }


    public MemberDto mapToMemberDto(MemberEntity memberEntity){
        MemberDto memberDto = new MemberDto();
        memberDto.setId(memberEntity.getId());
        memberDto.setFirstName(memberEntity.getFirstName());
        memberDto.setLastName(memberEntity.getLastName());
        memberDto.setEmail(memberEntity.getEmail());
        memberDto.setPromo(memberEntity.getPromo());
        memberDto.setTel(memberEntity.getTel());
        memberDto.setExecutiveTeam(memberEntity.getExecutiveTeam());
        memberDto.setPromo(memberEntity.getPromo());

        return memberDto;
    }
}
