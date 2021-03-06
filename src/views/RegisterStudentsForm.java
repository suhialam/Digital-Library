/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DAO.StudentDAO;
import entity.Department;
import entity.Student;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import services.CommonService;
import services.StudentService;

/**
 *
 * @author suhail
 */
public class RegisterStudentsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegisterStudentsForm
     */
    private StudentService studentService;
    private CommonService commonService;
    Vector<Department> vectorDepartments;
    //Vector<String> vectorRegistrationNo;
    String gender = "";

    public RegisterStudentsForm() {
        initComponents();
        studentService = new StudentService();
        commonService = new CommonService();
        vectorDepartments = commonService.getVectorDepartments();
        DefaultComboBoxModel modelDepartment = new DefaultComboBoxModel(vectorDepartments);
        cmbSelectDepartment.setModel(modelDepartment);

        buttonGroup1.add(rdbFemale);
        buttonGroup1.add(rdbMale);

        rdbMale.setSelected(true);

        buttonGroup2.add(rdbFemaleUpdate);
        buttonGroup2.add(rdbMaleUpdate);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtRegistrationNo = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCnic = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rdbMale = new javax.swing.JRadioButton();
        rdbFemale = new javax.swing.JRadioButton();
        cmbSelectDepartment = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStudentNameUpdate = new javax.swing.JTextField();
        txtPhoneNumberUpdate = new javax.swing.JTextField();
        txtCnicUpdate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFatherNameUpdate = new javax.swing.JTextField();
        txtAddressUpdate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        rdbMaleUpdate = new javax.swing.JRadioButton();
        rdbFemaleUpdate = new javax.swing.JRadioButton();
        txtRegNoUpdate = new javax.swing.JTextField();
        cmbDeparmentUpdate = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Register & Update Student Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Register Student"));

        btnSave.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel1.setText("Student Name");

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel2.setText("Registration No #");

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel4.setText("Father Name");

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel6.setText("CNIC");

        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnicActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel14.setText("Department Name");

        jLabel13.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel13.setText("Gender");

        rdbMale.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        rdbMale.setText("Male");

        rdbFemale.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        rdbFemale.setText("Female");

        cmbSelectDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtRegistrationNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhoneNumber)
                    .addComponent(cmbSelectDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAddress)
                        .addComponent(txtFatherName)
                        .addComponent(txtCnic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdbMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbFemale)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbMale)
                            .addComponent(rdbFemale)))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegistrationNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbSelectDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Student"));

        jLabel7.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel7.setText("Registration No #");

        jLabel8.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel8.setText("Student Name");

        jLabel9.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel9.setText("Phone Number");

        jLabel10.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel10.setText("CNIC");

        btnSearch.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel11.setText("Father Name");

        jLabel12.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel12.setText("Address");

        txtAddressUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressUpdateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel15.setText("Select Department");

        jLabel16.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel16.setText("Gender");

        rdbMaleUpdate.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        rdbMaleUpdate.setText("Male");

        rdbFemaleUpdate.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        rdbFemaleUpdate.setText("Female");

        cmbDeparmentUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCnicUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtPhoneNumberUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(txtStudentNameUpdate)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel16))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtRegNoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFatherNameUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(txtAddressUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rdbMaleUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbFemaleUpdate))
                    .addComponent(cmbDeparmentUpdate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnSearch)
                    .addComponent(jLabel11)
                    .addComponent(txtFatherNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegNoUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStudentNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtAddressUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cmbDeparmentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtPhoneNumberUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCnicUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(rdbMaleUpdate)
                    .addComponent(rdbFemaleUpdate))
                .addGap(42, 42, 42)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnicActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Student student = new Student();
        Department department = (Department) cmbSelectDepartment.getSelectedItem();
        String studentName = txtStudentName.getText();

        String fatherName = txtFatherName.getText();
        String cnic = txtCnic.getText();
        String registrationNumber = txtRegistrationNo.getText();
        String address = txtAddress.getText();
        String phoneNumber = txtPhoneNumber.getText();

        student.setStudentName(studentName);
        student.setFatherName(fatherName);
        student.setCnic(cnic);
        student.setAddress(address);
        student.setDepartment(department);

        student.setRegistrationNumber(registrationNumber);
        student.setPhoneNumber(phoneNumber);

        if (rdbMale.isSelected()) {
            student.setGender(("1"));
        } else if (rdbFemale.isSelected()) {
            student.setGender("0");
        }

        studentService.registerStudent(student);

        txtAddress.setText("");
        txtCnic.setText("");
        txtFatherName.setText("");
        txtPhoneNumber.setText("");
        txtRegistrationNo.setText("");
        txtStudentName.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Student student;
        String registrationNo = txtRegNoUpdate.getText();
        System.out.println(registrationNo);
        if (registrationNo.equals("")) {
            JOptionPane.showMessageDialog(this, "Empty Data Cannot Be Shown");

        } else {
            student = commonService.StudentSearch(registrationNo);
            txtStudentNameUpdate.setText(student.getStudentName());
            txtFatherNameUpdate.setText(student.getFatherName());
            txtAddressUpdate.setText(student.getAddress());
            txtCnicUpdate.setText(student.getCnic());
            txtPhoneNumberUpdate.setText(student.getPhoneNumber());

            DefaultComboBoxModel modelUpdate = new DefaultComboBoxModel(vectorDepartments);

            Department departmentUpdate = student.getDepartment();

            modelUpdate.setSelectedItem(departmentUpdate);

            cmbDeparmentUpdate.setModel(modelUpdate);

            String gender;
            gender = student.getGender();
            if (gender.equals("1")) {
                rdbMaleUpdate.setSelected(true);

            } else {
                rdbFemaleUpdate.setSelected(true);

            }
            txtRegNoUpdate.setEditable(true);
        }


    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       Student student = new Student();
        //Department department = new Department();
       StudentDAO studentDAO = new StudentDAO();
        student.setStudentName(txtStudentNameUpdate.getText());
        student.setFatherName(txtFatherNameUpdate.getText());
        student.setAddress(txtAddressUpdate.getText());
        student.setPhoneNumber(txtPhoneNumberUpdate.getText());
        student.setCnic(txtCnicUpdate.getText());
        student.setRegistrationNumber(txtRegNoUpdate.getText());
       
        Department department = (Department) cmbDeparmentUpdate.getSelectedItem();
//JOptionPane.showMessageDialog(this, department);
        if (rdbMaleUpdate.isSelected()) {
            student.setGender(("1"));
        } else if (rdbFemaleUpdate.isSelected()) {
            student.setGender("0");
        }
        studentDAO.updateStudent(student , department);
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cmbDeparmentUpdate;
    private javax.swing.JComboBox<String> cmbSelectDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbFemaleUpdate;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JRadioButton rdbMaleUpdate;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddressUpdate;
    private javax.swing.JTextField txtCnic;
    private javax.swing.JTextField txtCnicUpdate;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFatherNameUpdate;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPhoneNumberUpdate;
    private javax.swing.JTextField txtRegNoUpdate;
    private javax.swing.JTextField txtRegistrationNo;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentNameUpdate;
    // End of variables declaration//GEN-END:variables
}
