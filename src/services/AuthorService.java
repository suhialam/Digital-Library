/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DAO.AuthorDAO;
import entity.Author;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class AuthorService {

    private AuthorDAO authorDAO;

    public AuthorService() {
        authorDAO = new AuthorDAO();
    }

    /**
     * this method will check the existence of the current author if the author
     * is already registered, then this method will display an error message,
     * other wise it will send the author object to registerAuthor method in
     * AuthorDAO class.
     *
     * @param author
     */
    public void registerAuthor(Author author) {
        /**
         * the below code will check the object, whether it has empty data or
         * not.
         */
        if (author.getAuthorName().equals("") || author.getEmail().equals("")
                || author.getPhoneNumber().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty data can not be stored.");
        } else {
            SQLQueryUtil sql = new SQLQueryUtil();
            sql.connect(false);

            String queryExistance = "SELECT COUNT(*) AS `count` FROM `authors` "
                    + " WHERE `email` LIKE('" + author.getEmail() + "') OR `phone_number` "
                    + "LIKE('" + author.getPhoneNumber() + "');";

            try {
                ResultSet resultSet = sql.executeQuery(queryExistance);
                resultSet.next();

                int count = resultSet.getInt("count");

                if (count == 0) {
                    authorDAO.registerAuthor(author);
                } else {
                    JOptionPane.showMessageDialog(null, "This author has already been registered.");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void updateAuthor(Author author) {
        if (author.getAuthorName().equals("") || author.getEmail().equals("") || author.getPhoneNumber().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot be Stored");

        } else {
                authorDAO.updateAuthor(author);
           
        }
    }
}
