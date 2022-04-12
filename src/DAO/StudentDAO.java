/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

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
public class StudentDAO {

    public void registerStudent(Student student) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        System.out.println("Query About to execute");

        String query = "INSERT INTO `students`( `student_name`, `father_name`, `phone_number`,"
                + " `registration_number`, `gender`, `cnic`,`address` , `department_id`)" + "VALUES ('"
                + student.getStudentName() + "','" + student.getFatherName() + "','" + student.getPhoneNumber()
                + "','" + student.getRegistrationNumber() + "','" + student.getGender() + "','" + student.getCnic() + "','"
                + student.getAddress() + "','" + student.getDepartment().getDepartmentId() + "');";
        System.out.println(query);
        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Student Registered Succesfully,");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

    }

    public void updateStudent(Student student, Department department) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        String query = "UPDATE `students` SET `student_name`='"
                + student.getStudentName() + "',"
                + "`father_name`='" + student.getFatherName() + "',"
                + "`phone_number`= '" + student.getPhoneNumber() + "',"
                + "`gender`='" + student.getGender() + "',"
                + "`cnic`='" + student.getCnic() + "',"
                + "`department_id`= '" + department.getDepartmentId() + "',"
                + "`address` = '"+student.getAddress()+"'"
                + " WHERE `registration_number`= " + student.getRegistrationNumber() + ";";
        System.out.println(query);
        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Student Updated Succesfully");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
    }
    
    
    public void issueBooks(Vector<Book> vectorBooks, String registrationNumber, String selectedDate) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        String query = "";
        
        try {
            query = "SELECT `student_id` FROM `students` WHERE `registration_number`='"
                    + registrationNumber + "';";
            ResultSet rs = sql.executeQuery(query);
            rs.next();
            
            int studentId = rs.getInt("student_id");
            
            System.out.println(studentId);
            
            String edition = "";
            int bookId = 0;
            int bookDetailId = 0;
            
            ResultSet resultSet;
            String queryInsert;
            
            for(int i = 0; i < vectorBooks.size(); i++) {
                bookId = vectorBooks.get(i).getBookId();
                edition = vectorBooks.get(i).getEdition();
                
                query = "SELECT `book_detail_id` FROM `book_details` WHERE "
                        + "`book_id`=" + bookId + " AND `edition`='" + edition + "';";
                
                resultSet = sql.executeQuery(query);
                resultSet.next();
                
                bookDetailId = resultSet.getInt("book_detail_id");
                
                queryInsert = "INSERT INTO `issue_return_history`(`student_id`, `book_detail_id`, `issue_date`) "
                        + "VALUES (" + studentId + ", " + bookDetailId + ", '" + selectedDate + "');";
                sql.executeUpdate(queryInsert);
                
            }
            
            sql.commit();
            JOptionPane.showMessageDialog(null, "success");
            
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
