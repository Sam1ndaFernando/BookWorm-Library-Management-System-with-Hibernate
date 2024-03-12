package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.TransactionDao;
import lk.ijse.entity.Transaction;
import lk.ijse.entity.User;

import java.sql.SQLException;
import java.util.List;

public class TransactionDaoImpl implements TransactionDao {
    @Override
    public boolean save(Transaction entity) throws SQLException {
        return false;
    }

    @Override
    public List<Transaction> getByUserId(User user) throws SQLException {
        return null;
    }
}
