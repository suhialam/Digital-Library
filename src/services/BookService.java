/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DAO.BookDAO;
import entity.Author;
import entity.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class BookService {

    private BookDAO bookDAO;

    public BookService() {
        bookDAO = new BookDAO();
    }

    public void registerBook(Book books) {
        if (books.getBookName().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Stored");
        } else {

            SQLQueryUtil sql = new SQLQueryUtil();
            sql.connect(false);

            String queryExistance = "SELECT COUNT(*)AS `count` FROM `books` "
                    + "WHERE `book_name` LIKE('" + books.getBookName() + "');";
            try {
                ResultSet resultSet = sql.executeQuery(queryExistance);
                resultSet.next();

                int count = resultSet.getInt("count");
                if (count == 0) {

                    bookDAO.registerBook(books);
                } else {
                    JOptionPane.showMessageDialog(null, "This Book Is Already Saved. ");
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void updateBook(Book book) {
        if (book.getBookName().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot be Stored");

        } else {
            bookDAO.updateBook(book);

        }
    }

    public void addBookDetail(Book cmbSelectedBook, Book book) {
        if (book.getEdition().equals("") || book.getPurchasePrice() <= 0) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Stored.");
        } else {

            SQLQueryUtil sql = new SQLQueryUtil();
            sql.connect(false);
            String queryExistance = "SELECT COUNT(*) AS `count` FROM `book_details` WHERE `book_id`="
                    + cmbSelectedBook.getBookId() + " AND `edition` LIKE ('"
                    + book.getEdition() + "')AND `purchase_price` " + "LIKE('"
                    + book.getPurchasePrice() + "') AND `quantity`" + "LIKE('" + book.getQuantity() + "');";
            System.out.println(queryExistance);
            try {
                ResultSet resultSet = sql.executeQuery(queryExistance);
                resultSet.next();

                int count = resultSet.getInt("count");
                if (count == 0) {
                    bookDAO.addBookDetail(cmbSelectedBook, book);
                } else {
                    JOptionPane.showMessageDialog(null, "This Detail Is Already Added.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                sql.disconnect();
            }

        }
    }

    public void updateBookDetail(Book cmbSelectedBook, String cmbSelectedEdition, Book book) {
        if (book.getEdition().equals("") || book.getQuantity() <= 0 || book.getPurchasePrice() <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid or Empty Data Cannot Be Updated");
        } else {
            bookDAO.updateBookDetail(cmbSelectedBook, cmbSelectedEdition, book);
        }
    }
}
