/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DAO.StudentDAO;
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
public class StudentService {

    private StudentDAO studentDAO;

    public StudentService() {
        studentDAO = new StudentDAO();
    }

    public void registerStudent(Student student) {
        //studentDAO.registerStudent(student);
        if (student.getStudentName().equals("") || student.getFatherName().equals("")
                || student.getRegistrationNumber().equals("") || student.getCnic().equals("")
                ||student.getPhoneNumber().equals("")
                || student.getDepartment().getDepartmentId()<=0) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Stored.");
        } else {
            SQLQueryUtil sql = new SQLQueryUtil();
            sql.connect(false);

            String queryExistance = "SELECT COUNT(*) AS `count` FROM `students` "
                    + " WHERE `registration_number` LIKE('" + student.getRegistrationNumber() + "');";
            
            try{
                ResultSet resultSet = sql.executeQuery(queryExistance);
                resultSet.next();
                
                int count = resultSet.getInt("count");
                if(count==0){
                    studentDAO.registerStudent(student);
                }else{
                    JOptionPane.showMessageDialog(null, "This Student is Already Registered.");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    public void updateStudent(Student student , Department department ){
         //JOptionPane.showMessageDialog(null, "Hello");
        if (student.getStudentName().equals("") || student.getFatherName().equals("")
                || student.getRegistrationNumber().equals("") || student.getCnic().equals("")
                ||student.getPhoneNumber().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Stored.");
         }else{
             studentDAO.updateStudent(student , department);
         }
        
    }
    
    
    public void issueBooks(Vector<Book> vectorBooks, String registrationNumber, String selectedDate) {
        if(registrationNumber.equals("") || selectedDate.equals("") || vectorBooks.size() == 0) {
            JOptionPane.showMessageDialog(null, "Empty data");
        } else {
            studentDAO.issueBooks(vectorBooks, registrationNumber, selectedDate);
        }
    }
    
}
