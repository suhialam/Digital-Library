/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DAO.CommonDAO;
import entity.Author;
import entity.Book;
import entity.Department;
import entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class CommonService {

    private CommonDAO commonDao;

    public CommonService() {
        commonDao = new CommonDAO();
    }

    public Vector<Author> getVectorAuthors() {
        Vector<Author> vectorAuthors;

        vectorAuthors = commonDao.getVectorAuthors();
        return vectorAuthors;
    }

    public Vector<Author> getVectorAuthors(String authorName) {
        Vector<Author> vectorAuthors;

        vectorAuthors = commonDao.getVectorAuthors(authorName);
        return vectorAuthors;
    }

    public Vector<Book> getVectorBooks(Author author) {
        Vector<Book> vectorBooks;

        vectorBooks = commonDao.getVectorbooks(author);
        return vectorBooks;
    }

    public Vector<String> getVectorEdition(Book book) {
        Vector<String> vectorEdition;
        vectorEdition = commonDao.getVectorEdition(book);
        return vectorEdition;
    }

    public Book getBookDetail(Book book, String edition) {
        Book bookDetail;
        bookDetail = commonDao.getBookDetail(book, edition);
        return bookDetail;
    }

    public Vector<Department> getVectorDepartments() {
        Vector<Department> vectorDepartments = commonDao.getVectorDepartments();

        return vectorDepartments;

    }

    public Vector<Student> getVectorRegistrationNo() {
        Vector<Student> vectorRegistrationNo;
        vectorRegistrationNo = commonDao.getVectorRegistrationNo();
        return vectorRegistrationNo;
    }

    public Student StudentSearch(String registrationNo) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "SELECT * FROM `students` AS `s`, `department` AS `d` "
                + "WHERE `s`.`department_id` = `d`.`department_id` AND "
                + "`registration_number`='" + registrationNo + "';";

        System.out.println(query);

        ResultSet resultSet;
        Student student = new Student();
        Department department = new Department();
        try {
            resultSet = sql.executeQuery(query);

            while (resultSet.next()) {

                student.setStudentId(resultSet.getInt("student_id"));
                student.setStudentName(resultSet.getString("student_name"));

                student.setFatherName(resultSet.getString("father_name"));
                student.setAddress(resultSet.getString("address"));
                student.setCnic(resultSet.getString("cnic"));
                student.setPhoneNumber(resultSet.getString("phone_number"));
                student.setGender(resultSet.getString("gender"));
                
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                
                System.out.println("depatment = " + resultSet.getString("department_name"));
                student.setDepartment(department);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
        return student;
    }
}
