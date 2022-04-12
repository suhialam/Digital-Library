
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Author;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class AuthorDAO {

    public void registerAuthor(Author author) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String queryExistance = "INSERT INTO `authors`(`author_name`, `email`, `phone_number`) "
                + "VALUES ('"
                + author.getAuthorName() + "', '" + author.getEmail() + "', '"
                + author.getPhoneNumber() + "');";

        System.out.println(queryExistance);
        try {
            int rowsAffected = sql.executeUpdate(queryExistance);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Author registered successfully.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        } finally {
            sql.disconnect();
        }
    }

    public void updateAuthor(Author author) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        String query = "UPDATE `authors` SET `author_name`='"
                + author.getAuthorName() + "',"
                + "`email` = '" + author.getEmail() + "',"
                + "`phone_number`= '" + author.getPhoneNumber() + "'"
                + " WHERE `author_id`=" + author.getAuthorId() + ";";
        System.out.println(query);

        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Author Updated Successfully");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
    }
}
