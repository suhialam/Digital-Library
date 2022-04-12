/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entity.Department;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class DepartmentDAO {

    public DepartmentDAO() {

    }

    public void registerDepartment(Department department) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);

        String query = "INSERT INTO `department`(`department_name`)VALUES('"
                + department.getDepartmentName() + "');";
        System.out.println(query);
        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Department registered Succesfully");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }
    }

    public void updateDepartment(Department department) {
        SQLQueryUtil sql = new SQLQueryUtil();
        sql.connect(false);
        String query = "UPDATE `department` SET `department_name`='"
                + department.getDepartmentName() + "'" + " WHERE `department_id`= "
                + department.getDepartmentId() + ";";
        sql.commit();
        System.out.println(query);
        try {
            int rowsAffected = sql.executeUpdate(query);
            if (rowsAffected > 0) {
                sql.commit();
                JOptionPane.showMessageDialog(null, "Department Updated Succesfully");

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            sql.disconnect();
        }

    }
}
