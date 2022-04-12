/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author suhail
 */
public class MainForm extends javax.swing.JFrame {

    private AddUpdateAuthorsForm addUpdateAuthorsForm;
    private AllAuthorsForm allAuthorsForm;

    private AddUpdateBookForm addUpdateBookForm;
    private AddUpdateBookDetailsForm addUpdateBookdetailsForm;
    private SearchBookForm searchBookForm;

    private RegisterStudentsForm registerStudentsForm;
    

    private IssueBookForm issueBookForm;
    private ReturnBookForm returnBookForm;
    private SearchPendingForm searchPendingForm;
    
    private AddUpdateDepartment addUpdateDepartment;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuAuthors = new javax.swing.JMenu();
        miAddUpdateAuthors = new javax.swing.JMenuItem();
        miAllAuthors = new javax.swing.JMenuItem();
        mnuBooks = new javax.swing.JMenu();
        miAddUpdateBooks = new javax.swing.JMenuItem();
        miAddUpdateBookDetails = new javax.swing.JMenuItem();
        mnuStudents = new javax.swing.JMenu();
        miRegisterStudent = new javax.swing.JMenuItem();
        mnuIssue_And_Return = new javax.swing.JMenu();
        miIssueBook = new javax.swing.JMenuItem();
        miReturnBook = new javax.swing.JMenuItem();
        mnuDepartment = new javax.swing.JMenu();
        miAddUpdateDepartment = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 242, 241));

        mnuAuthors.setText("Authors");

        miAddUpdateAuthors.setText("Add/Update Authors");
        miAddUpdateAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUpdateAuthorsActionPerformed(evt);
            }
        });
        mnuAuthors.add(miAddUpdateAuthors);

        miAllAuthors.setText("All Authors");
        miAllAuthors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAllAuthorsActionPerformed(evt);
            }
        });
        mnuAuthors.add(miAllAuthors);

        jMenuBar1.add(mnuAuthors);

        mnuBooks.setText("Books");

        miAddUpdateBooks.setText("Add/Update Books");
        miAddUpdateBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUpdateBooksActionPerformed(evt);
            }
        });
        mnuBooks.add(miAddUpdateBooks);

        miAddUpdateBookDetails.setText("Add/Update Book Details");
        miAddUpdateBookDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUpdateBookDetailsActionPerformed(evt);
            }
        });
        mnuBooks.add(miAddUpdateBookDetails);

        jMenuBar1.add(mnuBooks);

        mnuStudents.setText("Students");

        miRegisterStudent.setText("Register Student");
        miRegisterStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegisterStudentActionPerformed(evt);
            }
        });
        mnuStudents.add(miRegisterStudent);

        jMenuBar1.add(mnuStudents);

        mnuIssue_And_Return.setText("Issue & Return");

        miIssueBook.setText("Issue Book");
        miIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIssueBookActionPerformed(evt);
            }
        });
        mnuIssue_And_Return.add(miIssueBook);

        miReturnBook.setText("Return Book");
        miReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miReturnBookActionPerformed(evt);
            }
        });
        mnuIssue_And_Return.add(miReturnBook);

        jMenuBar1.add(mnuIssue_And_Return);

        mnuDepartment.setText("Department");

        miAddUpdateDepartment.setText("Add/Update Department");
        miAddUpdateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUpdateDepartmentActionPerformed(evt);
            }
        });
        mnuDepartment.add(miAddUpdateDepartment);

        jMenuBar1.add(mnuDepartment);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddUpdateAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUpdateAuthorsActionPerformed
        addUpdateAuthorsForm = new AddUpdateAuthorsForm();
        this.add(addUpdateAuthorsForm);
        addUpdateAuthorsForm.setVisible(true);
    }//GEN-LAST:event_miAddUpdateAuthorsActionPerformed

    private void miAllAuthorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAllAuthorsActionPerformed
        allAuthorsForm = new AllAuthorsForm();
        this.add(allAuthorsForm);
        allAuthorsForm.setVisible(true);
    }//GEN-LAST:event_miAllAuthorsActionPerformed

    private void miAddUpdateBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUpdateBooksActionPerformed
        addUpdateBookForm = new AddUpdateBookForm();
        this.add(addUpdateBookForm);
        addUpdateBookForm.setVisible(true);
    }//GEN-LAST:event_miAddUpdateBooksActionPerformed

    private void miAddUpdateBookDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUpdateBookDetailsActionPerformed
        addUpdateBookdetailsForm = new AddUpdateBookDetailsForm();
        this.add(addUpdateBookdetailsForm);
        addUpdateBookdetailsForm.setVisible(true);

    }//GEN-LAST:event_miAddUpdateBookDetailsActionPerformed

    private void miRegisterStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegisterStudentActionPerformed
        registerStudentsForm = new RegisterStudentsForm();
        this.add(registerStudentsForm);
        registerStudentsForm.setVisible(true);
    }//GEN-LAST:event_miRegisterStudentActionPerformed

    private void miIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIssueBookActionPerformed
        issueBookForm = new IssueBookForm();
        this.add(issueBookForm);
        issueBookForm.setVisible(true);
    }//GEN-LAST:event_miIssueBookActionPerformed

    private void miReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miReturnBookActionPerformed
        returnBookForm = new ReturnBookForm();
        this.add(returnBookForm);
        returnBookForm.setVisible(true);
    }//GEN-LAST:event_miReturnBookActionPerformed

    private void miAddUpdateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUpdateDepartmentActionPerformed
        addUpdateDepartment = new AddUpdateDepartment();
        this.add(addUpdateDepartment);
        addUpdateDepartment.setVisible(true);
    }//GEN-LAST:event_miAddUpdateDepartmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miAddUpdateAuthors;
    private javax.swing.JMenuItem miAddUpdateBookDetails;
    private javax.swing.JMenuItem miAddUpdateBooks;
    private javax.swing.JMenuItem miAddUpdateDepartment;
    private javax.swing.JMenuItem miAllAuthors;
    private javax.swing.JMenuItem miIssueBook;
    private javax.swing.JMenuItem miRegisterStudent;
    private javax.swing.JMenuItem miReturnBook;
    private javax.swing.JMenu mnuAuthors;
    private javax.swing.JMenu mnuBooks;
    private javax.swing.JMenu mnuDepartment;
    private javax.swing.JMenu mnuIssue_And_Return;
    private javax.swing.JMenu mnuStudents;
    // End of variables declaration//GEN-END:variables
}
