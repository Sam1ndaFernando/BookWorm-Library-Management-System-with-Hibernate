package lk.ijse.bo.Custom.impl;

import lk.ijse.bo.Custom.AdminBo;
import lk.ijse.dto.AdminDto;

import java.sql.SQLException;
import java.util.List;

public class AdminBoImpl implements AdminBo {
    @Override
    public List<AdminDto> getAllAdmins() throws SQLException {
        return null;
    }

    @Override
    public AdminDto getAdminByEmail(String userName) throws SQLException {
        return null;
    }

    @Override
    public AdminDto getUserById(int id) throws SQLException {
        return null;
    }

    @Override
    public void updateAdmin(AdminDto dto) throws SQLException {

    }

    @Override
    public void saveAdmin(AdminDto adminDto) throws SQLException {

    }

    @Override
    public void deleteAdmin(int id) throws SQLException {

    }

    @Override
    public AdminDto getAdminById(int adminId) throws SQLException {
        return null;
    }
}
