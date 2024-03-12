package lk.ijse.bo.Custom.impl;

import lk.ijse.bo.Custom.UserBo;
import lk.ijse.dto.UserDto;

import java.sql.SQLException;
import java.util.List;

public class UserBoImpl implements UserBo {
    @Override
    public void saveUser(UserDto userDto) throws SQLException {

    }

    @Override
    public List<UserDto> getAllUsers() throws SQLException {
        return null;
    }

    @Override
    public UserDto getUser(String email) throws SQLException {
        return null;
    }

    @Override
    public void updateUser(UserDto dto) throws SQLException {

    }

    @Override
    public UserDto getUserById(int id) throws SQLException {
        return null;
    }

    @Override
    public void deleteUser(int id) throws SQLException {

    }
}
