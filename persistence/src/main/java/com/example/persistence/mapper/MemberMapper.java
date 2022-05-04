package com.example.persistence.mapper;

import com.club_HR.business.dto.MemberDto;
import com.club_HR.persistence.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberMapper {

    private CellMapper cellMapper;

    @Autowired
    public void setCellMapper(CellMapper cellMapper) {
        this.cellMapper = cellMapper;
    }

    /**
     * method which convert a dto to an entity
     * @param memberDto
     * @return
     */
    public MemberEntity mapToMemberEntity(MemberDto memberDto){
        MemberEntity memberEntity = new MemberEntity();

        memberEntity.setId(memberDto.getId());
        memberEntity.setFirstName(memberDto.getFirstName());
        memberEntity.setLastName(memberDto.getLastName());
        memberEntity.setEmail(memberDto.getEmail());
        memberEntity.setGender(memberDto.getGender());
        memberEntity.setPromo(memberDto.getPromo());
        memberEntity.setTel(memberDto.getTel());
        memberEntity.setCity(memberDto.getCity());
        memberEntity.setAge(memberDto.getAge());
        memberEntity.setLevel(memberDto.getLevel());

        // map cellDtos list
//        List<CellDto> cellsList = memberDto.getCellDtos();
//        List<CellEntity> cellEntitiesList = cellsList.stream().map(cell -> cellMapper.
//                mapToCellEntity(cell)).
//                collect(Collectors.toList());
//        memberEntity.setCellEntityList(cellEntitiesList);

        return memberEntity;
    }

    /**
     * method which convert an entity to a dto
     * @param memberEntity
     * @return
     */
    public MemberDto mapToMemberDto(MemberEntity memberEntity){
        MemberDto memberDto = new MemberDto();
        memberDto.setId(memberEntity.getId());
        memberDto.setFirstName(memberEntity.getFirstName());
        memberDto.setLastName(memberEntity.getLastName());
        memberDto.setEmail(memberEntity.getEmail());
        memberDto.setGender(memberEntity.getGender());
        memberDto.setPromo(memberEntity.getPromo());
        memberDto.setTel(memberEntity.getTel());
        memberDto.setCity(memberEntity.getCity());
        memberDto.setAge(memberEntity.getAge());
        memberDto.setLevel(memberEntity.getLevel());
        // map cellDtos
//        List<CellEntity> cellsEntitiesList = memberEntity.getCellEntityList();
//        List<CellDto> cellsList = cellsEntitiesList.stream().map(cell -> cellMapper.
//                        mapToCellDto(cell)).
//                collect(Collectors.toList());
//        memberDto.setCellDtos(cellsList);

        return memberDto;
    }
}