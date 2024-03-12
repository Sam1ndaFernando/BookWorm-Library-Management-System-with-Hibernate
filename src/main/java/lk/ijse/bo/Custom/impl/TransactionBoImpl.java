package lk.ijse.bo.Custom.impl;

import lk.ijse.bo.Custom.TransactionBo;
import lk.ijse.dto.TransactionDto;

import java.sql.SQLException;
import java.util.List;

public class TransactionBoImpl implements TransactionBo {
    @Override
    public boolean saveTransactiondata(int userId, String text, TransactionDto dto) throws SQLException {
        return false;
    }

    @Override
    public List<TransactionDto> getUnreturned(int userId) throws SQLException {
        return null;
    }
}
