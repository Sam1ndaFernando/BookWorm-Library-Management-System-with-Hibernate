package lk.ijse.dao.custom.impl;

import lk.ijse.dao.custom.BookDao;
import lk.ijse.entity.Book;
import lk.ijse.entity.Branch;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao {
    @Override
    public void save(Book entity) throws SQLException {

    }

    @Override
    public void update(Book entity) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public List<Book> loadAll() throws SQLException {
        return null;
    }

    @Override
    public Book get(String data) throws SQLException {
        return null;
    }

    @Override
    public Book getbyId(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Book> getBookByBranch(Branch branch) throws SQLException {
        return null;
    }

    @Override
    public List<Book> getByCategory(String category, Branch branch) throws SQLException {
        return null;
    }
}
