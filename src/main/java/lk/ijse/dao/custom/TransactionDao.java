package lk.ijse.dao.custom;

import lk.ijse.entity.Transaction;
import lk.ijse.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDao {

    boolean save(Transaction entity) throws SQLException;

    List<Transaction> getByUserId(User user) throws SQLException;

}
