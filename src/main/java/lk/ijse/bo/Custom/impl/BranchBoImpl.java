package lk.ijse.bo.Custom.impl;

import lk.ijse.bo.Custom.BranchBo;
import lk.ijse.dto.BranchDto;

import java.sql.SQLException;
import java.util.List;

public class BranchBoImpl implements BranchBo {
    @Override
    public void saveBranch(BranchDto dto) throws SQLException {

    }

    @Override
    public BranchDto getBranch(String name) throws SQLException {
        return null;
    }

    @Override
    public List<BranchDto> getAllBranches() throws SQLException {
        return null;
    }

    @Override
    public void updateBranch(BranchDto branchDto) throws SQLException {

    }

    @Override
    public void deleteBranch(int branchId) throws SQLException {

    }

    @Override
    public BranchDto getBranchById(int branchId) throws SQLException {
        return null;
    }
}
