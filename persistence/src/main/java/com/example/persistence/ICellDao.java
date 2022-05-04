package com.example.persistence;

import com.example.persistence.entity.CellEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

//cette interface permet de gérer l'entite member
@Transactional
public interface ICellDao extends JpaRepository<CellEntity, Long> {

    CellEntity findByCellRef(String cellRef);
    void deleteByCellRef(String cellRef);




}
