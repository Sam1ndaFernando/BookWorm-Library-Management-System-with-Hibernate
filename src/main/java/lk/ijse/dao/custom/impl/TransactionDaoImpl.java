package lk.ijse.dao.custom.impl;

import lk.ijse.dao.BaseDao;
import lk.ijse.dao.custom.TransactionDao;
import lk.ijse.entity.Transaction;
import lk.ijse.entity.User;
import org.hibernate.query.Query;

import java.sql.SQLException;
import java.util.List;

import static lk.ijse.dao.BaseDao.executeTransaction;

public class TransactionDaoImpl implements TransactionDao {
    @Override
    public boolean save(Transaction entity) throws SQLException {
        Object object = executeTransaction(session -> session.save(entity));
        if (object==null){
            return false;
        }
        return  true;
    }

    @Override
    public List<Transaction> getByUserId(User user) throws SQLException {
        System.out.println("ok");

        return executeTransaction(session -> {
            Query query = session.createQuery("from Transaction where user =:user and isReturn=:return");
            query.setParameter("user", user);
            query.setParameter("return", false);
            List<Transaction> transactions= query.getResultList();
            return transactions;

        });
    }
}
