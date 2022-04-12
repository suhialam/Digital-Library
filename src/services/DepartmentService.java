/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import DAO.DepartmentDAO;
import entity.Department;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import util.SQLQueryUtil;

/**
 *
 * @author suhail
 */
public class DepartmentService {

    DepartmentDAO departmentDAO;

    public DepartmentService() {
        departmentDAO = new DepartmentDAO();
    }

    public void registerDepartment(Department department) {
        if (department.getDepartmentName().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Stored");
        } else {
            SQLQueryUtil sql = new SQLQueryUtil();
            sql.connect(false);
            
            String queryExistance = "SELECT COUNT(*) AS `count` FROM `department` WHERE `department_name` LIKE('"
                    +department.getDepartmentName()+"');";
            try{
                ResultSet resultSet = sql.executeQuery(queryExistance);
                resultSet.next();
                int count = resultSet.getInt("count");
                if(count==0){
                    departmentDAO.registerDepartment(department);
                }else{
                    JOptionPane.showMessageDialog(null,"This Department Is Already Registered");
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
                    
                    
        }
    }
public void updateDepartment(Department department){
   // if(department.getDepartmentName().equals("")){
     //   JOptionPane.showMessageDialog(null, "Empty Data Cannot Be Updated");
    //}else{
        
        departmentDAO.updateDepartment(department);
    //}
}
}
