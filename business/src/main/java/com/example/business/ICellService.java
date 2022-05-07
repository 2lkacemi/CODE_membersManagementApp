package com.example.business;

import com.example.persistence.dto.CellDto;

import java.util.List;


public interface ICellService {

     void addCell(CellDto cellDto);
     CellDto updateCell(CellDto cell);
     void removeCellByCellRef(String cellRef);
     List<CellDto> getAllCells();
     void addMemberToCell(String email, String cellRef);
     CellDto getCellByCellRef(String cellRef);
     CellDto getCellById(Long id);
     void removeMemberFromCell(String email, String cellRef);



}
