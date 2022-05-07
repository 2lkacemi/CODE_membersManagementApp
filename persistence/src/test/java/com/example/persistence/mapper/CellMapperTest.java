//package com.example.persistence.mapper;
//
//import com.example.persistence.dto.CellDto;
//import com.example.persistence.entity.CellEntity;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.MockitoJUnitRunner;
//
//
//public class CellMapperTest {
//
//    @InjectMocks
//    CellMapper cellMapper;
//
//    @Test
//    public void mapToCellEntityTest() {
//        CellDto cellDto = new CellDto();
//        cellDto.setId(2);
//        cellDto.setCellName("Training");
//        cellDto.setCellDescription("Organize trainings and workshops");
//        cellDto.setCellRef("Trai_cell");
//
//        CellEntity cellEntity = cellMapper.mapToCellEntity(cellDto);
//
//        assert
