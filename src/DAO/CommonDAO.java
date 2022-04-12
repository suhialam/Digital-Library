/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Author;
import entity.Book;
import entity.Department;
import entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class CommonDAO {

    public Vector<Author> getVectorAuthors() {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "select * from authors order by author_name ASC;";
        Author author;
        Vector<Author> vectorAuthors = new Vector<>();

        ResultSet resultSet;

        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                author = new Author();

                author.setAuthorId(resultSet.getInt("author_id"));
                author.setAuthorName(resultSet.getString("author_name"));
                author.setEmail(resultSet.getString("email"));
                author.setPhoneNumber(resultSet.getString("phone_number"));

                vectorAuthors.add(author);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return vectorAuthors;
    }

    public Vector<Author> getVectorAuthors(String authorName) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "SELECT * FROM `authors` WHERE author_name LIKE('"
                + authorName + "%') ORDER BY `author_name` ASC;";
        Author author;
        Vector<Author> vectorAuthors = new Vector<>();

        ResultSet resultSet;

        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                author = new Author();

                author.setAuthorId(resultSet.getInt("author_id"));
                author.setAuthorName(resultSet.getString("author_name"));
                author.setEmail(resultSet.getString("email"));
                author.setPhoneNumber(resultSet.getString("phone_number"));

                vectorAuthors.add(author);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return vectorAuthors;
    }

    public Vector<Book> getVectorbooks(Author author) {

        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "SELECT * FROM  `books` WHERE `author_id`=" + author.getAuthorId() + ";";
        System.out.println(query);
        Book book;
        Vector<Book> vectorBooks = new Vector<>();

        ResultSet resultSet;

        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                book = new Book();

                book.setBookId(resultSet.getInt("book_id"));
                book.setBookName(resultSet.getString("book_name"));
                book.setAuthor(author);

                vectorBooks.add(book);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return vectorBooks;
    }

    public Vector<String> getVectorEdition(Book book) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "SELECT `edition` FROM `book_details` WHERE `book_id`="
                + book.getBookId() + " ORDER BY `edition` ASC;";
        System.out.println(query);
        Vector<String> vectorEdition = new Vector<>();
        ResultSet resultSet;
        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                //book = new Book();
                //vectorEdition.setEdition(resultSet.getString("edition"));

                vectorEdition.add(resultSet.getString("edition"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return vectorEdition;
    }

    public Book getBookDetail(Book book, String edition) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        Book bookDetail = new Book();
        String query = "SELECT `purchase_price`,`quantity` FROM `book_details`WHERE `book_id`= "
                + book.getBookId() + " AND `edition` LIKE('" + edition + "');";
        System.out.println(query);
        ResultSet resultSet;
        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                bookDetail.setPurchasePrice(resultSet.getInt("purchase_price"));
                bookDetail.setQuantity(resultSet.getInt("quantity"));

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return bookDetail;
    }

    public Vector<Department> getVectorDepartments() {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "SELECT * FROM `department` ORDER BY `department_name` ASC;";
        System.out.println(query);

        Vector<Department> vectorDepartments = new Vector<>();
        Department department;
        ResultSet resultSet;

        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                department = new Department();

                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));

                vectorDepartments.add(department);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

        return vectorDepartments;
    }
    
     public Vector<Student> getVectorRegistrationNo() {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        
        String query = "SELECT * FROM `students` ORDER BY `registration_number` ASC;";
        System.out.println(query);
        Vector<Student> vectorRegistrationNo = new Vector<>();
        ResultSet resultSet;
        
        try {
            resultSet = sql.executeQuery(query);
            while (resultSet.next()) {
                Student student  = new Student();
                
                student.setRegistrationNumber(resultSet.getString("registration_number"));
               
                vectorRegistrationNo.add(student);
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return vectorRegistrationNo;
    }
}
