/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Book;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 * "INSERT INTO `authors`(`author_name`, `email`, `phone_number`) " + "VALUES
 * ('" + author.getAuthorName() + "', '" + author.getEmail() + "', '" +
 * author.getPhoneNumber() + "');";
 *
 * @author suhail
 */
public class BookDAO {

    public void registerBook(Book books) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        System.out.println("Query is about to execute");
        String query = "INSERT INTO `books`(`book_name`,  `author_id`) "
                + "VALUES ('"
                + books.getBookName() + "', '" + books.getAuthor().getAuthorId() + "');";
        System.out.println(query);

        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Book Added Succesfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

    }//"update medicine set medicine_name='" + medicine.getMedicineName() 
    //+ "' where medicine_id=" + medicine.getMedicineId() + ";";

public void updateBook(Book book) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        String query = "UPDATE `books` SET `book_name`='"
                + book.getBookName() + "' WHERE `book_id`= " + book.getBookId() + ";";
        System.out.println(query);

        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Book Updated Successfully");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
    }

    public void addBookDetail(Book cmbSelectedBook, Book books) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "INSERT INTO `book_details`(`book_id`,`edition`,`purchase_price`,`quantity`)"
                + "VALUES('" + cmbSelectedBook.getBookId() + "','" + books.getEdition() + "','"
                + books.getPurchasePrice() + "','" + books.getQuantity() + "');";
        System.out.println(query);

        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Book Detail Added Succesfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

    }

    public void updateBookDetail(Book cmbSelectedBook, String cmbSelectedEdition, Book book) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "UPDATE `book_details` SET `edition` = '"
                + book.getEdition() + "',`quantity` = '"
                + book.getQuantity() + "',`purchase_price`= '"
                + book.getPurchasePrice() + "' WHERE `book_id` = " + cmbSelectedBook.getBookId()
                + " AND `edition` LIKE ('" + cmbSelectedEdition + "');";
        System.out.println(query);
        try {
            int rowsAffected = sql.executeUpdate(query);
            sql.commit();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Book Detail Updated Succesfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

    }

}
