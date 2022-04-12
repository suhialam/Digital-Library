/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import DAO.CommonDAO;
import entity.Author;
import entity.Book;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import services.BookService;
import services.CommonService;

/**
 *
 * @author suhail
 */
public class AddUpdateBookDetailsForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form Add_UpdateBookDetailsForm
     */
    private CommonService commonService;
    private BookService bookService;
    private Vector<Author> vectorAuthors;

    public AddUpdateBookDetailsForm() {
        initComponents();
        bookService = new BookService();
        commonService = new CommonService();
        vectorAuthors = commonService.getVectorAuthors();
        DefaultComboBoxModel modelAuthor = new DefaultComboBoxModel(vectorAuthors);
        cmbSelectAuthor.setModel(modelAuthor);
        
        cmbSelectAuthorUpdate.setModel(modelAuthor);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbSelectAuthor = new javax.swing.JComboBox<>();
        txtEdition = new javax.swing.JTextField();
        txtPurchasePrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbSelectBook = new javax.swing.JComboBox<>();
        spnQuantity = new javax.swing.JSpinner();
        btnSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbSelectBookUpdate = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEditionUpdate = new javax.swing.JTextField();
        txtPurchasePriceUpdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearchUpdate = new javax.swing.JTextField();
        cmbSelectAuthorUpdate = new javax.swing.JComboBox<>();
        spnQuantityUpdate = new javax.swing.JSpinner();
        cmbSelectEdition = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Add Update Book Details Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Book Detail"));

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel1.setText("Search");

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel2.setText("Select Author");

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel3.setText("Edition");

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel4.setText("Purchase Price");

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cmbSelectAuthor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelectAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectAuthorActionPerformed(evt);
            }
        });

        txtEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel5.setText("Select Book");

        jLabel6.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");

        cmbSelectBook.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelectBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectBookActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPurchasePrice)
                                    .addComponent(txtSearch)
                                    .addComponent(cmbSelectAuthor, 0, 122, Short.MAX_VALUE)
                                    .addComponent(txtEdition))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbSelectBook, 0, 128, Short.MAX_VALUE)
                            .addComponent(spnQuantity))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSelectAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbSelectBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPurchasePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(spnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Update Book Detail"));

        btnUpdate.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel11.setText("Select Book");

        cmbSelectBookUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelectBookUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectBookUpdateActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel12.setText("Edition");

        jLabel13.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel13.setText("Purchase Price");

        jLabel7.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel7.setText("Search");

        jLabel8.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel8.setText("Select Author");

        jLabel9.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel9.setText("Select Edition");

        jLabel10.setFont(new java.awt.Font("Abyssinica SIL", 0, 18)); // NOI18N
        jLabel10.setText("Quantity");

        txtSearchUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchUpdateActionPerformed(evt);
            }
        });
        txtSearchUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchUpdateKeyReleased(evt);
            }
        });

        cmbSelectAuthorUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelectAuthorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectAuthorUpdateActionPerformed(evt);
            }
        });

        cmbSelectEdition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbSelectEdition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectEditionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(cmbSelectAuthorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnQuantityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEditionUpdate)
                    .addComponent(txtPurchasePriceUpdate)
                    .addComponent(cmbSelectBookUpdate, 0, 143, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtSearchUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbSelectAuthorUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(cmbSelectBookUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmbSelectEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtEditionUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(spnQuantityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtPurchasePriceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditionActionPerformed

    private void cmbSelectBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectBookActionPerformed

    private void cmbSelectAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectAuthorActionPerformed
        Author author = (Author) cmbSelectAuthor.getSelectedItem();
        Vector<Book> vectorBooks;
        vectorBooks = commonService.getVectorBooks(author);
        DefaultComboBoxModel modelBooks = new DefaultComboBoxModel(vectorBooks);
        cmbSelectBook.setModel(modelBooks);
    }//GEN-LAST:event_cmbSelectAuthorActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String authorName = txtSearch.getText();
        vectorAuthors = commonService.getVectorAuthors(authorName);
        DefaultComboBoxModel modelAuthors = new DefaultComboBoxModel(vectorAuthors);
        cmbSelectAuthor.setModel(modelAuthors);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Book cmbSelectedBook = (Book) cmbSelectBook.getSelectedItem();
        Book book = new Book();
        
        int quantity = (int) spnQuantity.getValue();
        String edition = txtEdition.getText();
        int purchasePrice;
        purchasePrice = (Integer.parseInt(txtPurchasePrice.getText()));

        book.setEdition(edition);
        book.setPurchasePrice(purchasePrice);
        book.setQuantity(quantity);

        bookService.addBookDetail(cmbSelectedBook, book);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbSelectAuthorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectAuthorUpdateActionPerformed
       Author author = (Author)cmbSelectAuthorUpdate.getSelectedItem();
       Vector<Book> vectorBooks ;
       vectorBooks = commonService.getVectorBooks(author);
       DefaultComboBoxModel modelBooks = new DefaultComboBoxModel(vectorBooks);
       cmbSelectBookUpdate.setModel(modelBooks);
    }//GEN-LAST:event_cmbSelectAuthorUpdateActionPerformed

    private void txtSearchUpdateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUpdateKeyReleased
     String authorName = txtSearchUpdate.getText();
     vectorAuthors = commonService.getVectorAuthors(authorName);
     DefaultComboBoxModel modelAuthors = new DefaultComboBoxModel(vectorAuthors);
     cmbSelectAuthorUpdate.setModel(modelAuthors);
    }//GEN-LAST:event_txtSearchUpdateKeyReleased

    private void cmbSelectBookUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectBookUpdateActionPerformed
   Book book = (Book) cmbSelectBookUpdate.getSelectedItem();
   Vector<String> vectorEdition = commonService.getVectorEdition(book);
   DefaultComboBoxModel modelEdition = new DefaultComboBoxModel(vectorEdition);
   cmbSelectEdition.setModel(modelEdition);
    }//GEN-LAST:event_cmbSelectBookUpdateActionPerformed

    private void cmbSelectEditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectEditionActionPerformed
        Book book = (Book) cmbSelectBookUpdate.getSelectedItem();
        String edition = cmbSelectEdition.getSelectedItem().toString();
        Book bookDetail = commonService.getBookDetail(book, edition);
        txtEditionUpdate.setText(edition);
        spnQuantityUpdate.setValue(bookDetail.getQuantity());
        txtPurchasePriceUpdate.setText(bookDetail.getPurchasePrice()+"");
    }//GEN-LAST:event_cmbSelectEditionActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       Book cmbSelectedBook = (Book) cmbSelectBookUpdate.getSelectedItem();
       String cmbSelectedEdition = cmbSelectEdition.getSelectedItem().toString();
       
       Book book = new Book();
       book.setEdition(txtEditionUpdate.getText());
       book.setQuantity((int)spnQuantityUpdate.getValue());
       book.setPurchasePrice(Integer.parseInt(txtPurchasePriceUpdate.getText()));
       
       bookService.updateBookDetail(cmbSelectedBook,cmbSelectedEdition,book);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtSearchUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbSelectAuthor;
    private javax.swing.JComboBox<String> cmbSelectAuthorUpdate;
    private javax.swing.JComboBox<String> cmbSelectBook;
    private javax.swing.JComboBox<String> cmbSelectBookUpdate;
    private javax.swing.JComboBox<String> cmbSelectEdition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JSpinner spnQuantityUpdate;
    private javax.swing.JTextField txtEdition;
    private javax.swing.JTextField txtEditionUpdate;
    private javax.swing.JTextField txtPurchasePrice;
    private javax.swing.JTextField txtPurchasePriceUpdate;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchUpdate;
    // End of variables declaration//GEN-END:variables
}
