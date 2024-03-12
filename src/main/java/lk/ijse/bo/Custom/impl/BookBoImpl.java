package lk.ijse.bo.Custom.impl;

import lk.ijse.bo.Custom.BookBo;
import lk.ijse.dto.BookDto;

import java.sql.SQLException;
import java.util.List;

public class BookBoImpl implements BookBo {
    @Override
    public void saveBook(BookDto bookDto) throws SQLException {

    }

    @Override
    public List<BookDto> getAllBook() throws SQLException {
        return null;
    }

    @Override
    public BookDto getBook(String text) throws SQLException {
        return null;
    }

    @Override
    public void deleteBook(int id) throws SQLException {

    }

    @Override
    public void updateBook(BookDto bookDto) throws SQLException {

    }

    @Override
    public List<BookDto> getBookByBranch(String branchName) throws SQLException {
        return null;
    }

    @Override
    public List<BookDto> getBookByCategory(String category, String branchName) throws SQLException {
        return null;
    }
}
