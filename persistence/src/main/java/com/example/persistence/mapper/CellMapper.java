package com.example.persistence.mapper;

import com.example.persistence.dto.CellDto;
import com.example.persistence.dto.MemberDto;
import com.example.persistence.entity.CellEntity;
import com.example.persistence.entity.MemberEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CellMapper {
    private MemberMapper memberMapper;

    @Autowired
    public void setMemberMapper(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }


    public CellEntity mapToCellEntity(CellDto cellDto){
        CellEntity cellEntity = new CellEntity();

        cellEntity.setId(cellDto.getId());
        cellEntity.setCellRef(cellDto.getCellRef());
        cellEntity.setCellName(cellDto.getCellName());
        cellEntity.setCellDescription(cellDto.getCellDescription());

        List<MemberDto> membersList = cellDto.getMemberDtoList();
        List<MemberEntity> memberEntitiesList = membersList.stream()
                .map(member -> memberMapper.mapToMemberEntity(member))
                .collect(Collectors.toList());
        cellEntity.setMemberEntityList(memberEntitiesList);

        return cellEntity;
    }


    public CellDto mapToCellDto(CellEntity cellEntity){
        CellDto cellDto = new CellDto();
        cellDto.setId(cellEntity.getId());
        cellDto.setCellRef(cellEntity.getCellRef());
        cellDto.setCellName(cellEntity.getCellName());
        cellDto.setCellDescription(cellEntity.getCellDescription());

        List<MemberEntity> memberEntityList = cellEntity.getMemberEntityList();
        List<MemberDto> memberDtoList = memberEntityList.stream()
                .map(member -> memberMapper.mapToMemberDto(member))
                .collect(Collectors.toList());
        cellDto.setMemberDtoList(memberDtoList);

        return cellDto;
    }

}
