/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author suhail
 */
public class Department {
    private int departmentId;
    private String departmentName;
    
    public Department(){
        
    }
    public int getDepartmentId(){
        return departmentId;
    } 
    
    public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    @Override
    public String toString(){
        return departmentName;
    }
    
}
