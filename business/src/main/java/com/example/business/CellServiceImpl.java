package com.example.business;

import com.example.persistence.ICellDao;
import com.example.persistence.dto.CellDto;
import com.example.persistence.dto.MemberDto;
import com.example.persistence.entity.CellEntity;
import com.example.persistence.mapper.CellMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CellServiceImpl implements ICellService{

    final private ICellDao iCellDao;
    final private IMemberService iMemberService;
    final private CellMapper cellMapper;

    @Autowired
    public CellServiceImpl(ICellDao iCellDao, IMemberService iMemberService, CellMapper cellMapper) {
        this.iCellDao = iCellDao;
        this.iMemberService = iMemberService;
        this.cellMapper = cellMapper;
    }

    /**
     * add a cell
     * @param cellDto parameter
     */
    @Override
    public void addCell(CellDto cellDto) {
        cellDto.setCellRef(cellDto.getCellName().substring(0,5)+ "_cell");
        this.iCellDao.save(cellMapper.mapToCellEntity(cellDto));
    }

    /**
     * update a cell
     * @param cell parameter
     */
    @Override
    public CellDto updateCell(CellDto cell){
        CellEntity cellEntity = cellMapper.mapToCellEntity(cell);
        iCellDao.save(cellEntity);
        return cell;
    }

    /**
     * remove a cell using cellRef
     * @param cellRef parameter
     */
    @Override
    public void removeCellByCellRef(String cellRef) {
        iCellDao.deleteByCellRef(cellRef);
    }

    /**
     * get a list of all cells
     * @return a list of cells
     */
    @Override
    public List<CellDto> getAllCells() {
        List<CellEntity> cellEntitiesList = iCellDao.findAll();

        return cellEntitiesList
                .stream()
                .map(cellEntity -> cellMapper.mapToCellDto(cellEntity))
                .collect(Collectors.toList());
    }

    /**
     * add a member to a cell
     * @param email first param
     * @param cellRef second param
     */
    @Override
    public void addMemberToCell(String email, String cellRef) {
        //recuperer le membre avec id == id
        MemberDto memberDto = iMemberService.getMemberByEmail(email);
        CellDto cellDto = this.getCellByCellRef(cellRef);

        if (!cellDto.getMemberDtoList().contains(memberDto)){
            cellDto.getMemberDtoList().add(memberDto);
            iCellDao.save(cellMapper.mapToCellEntity(cellDto));
        }
    }

    /**
     * get a cell by a cellRef
     * @param cellRef parameter
     * @return cell
     */
    @Override
    public CellDto getCellByCellRef(String cellRef) {
        return iCellDao.findByCellRef(cellRef) != null ? cellMapper.mapToCellDto(iCellDao.findByCellRef(cellRef)) : null;
    }

    /**
     * get a cell by id
     * @param id param
     * @return cell
     */
    @Override
    public CellDto getCellById(Long id) {
        return iCellDao.findById(id).isPresent() ? cellMapper.mapToCellDto(iCellDao.findById(id).get()) : null;
    }

    /**
     * remove member from a cell
     * @param email first param
     * @param cellRef second para
     */
    @Override
    public void removeMemberFromCell(String email, String cellRef) {
        //recuperer le membre avec id == id
        MemberDto memberDto = iMemberService.getMemberByEmail(email);
        CellDto cellDto = this.getCellByCellRef(cellRef);
        if (cellDto.getMemberDtoList().contains(memberDto)){
            cellDto.getMemberDtoList().remove(memberDto);
            iCellDao.save(cellMapper.mapToCellEntity(cellDto));
        }
    }
}
