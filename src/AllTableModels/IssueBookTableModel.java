/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTableModels;

import entity.Book;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author suhail
 */
public class IssueBookTableModel extends AbstractTableModel {

    private Vector<Book> vectorBooks;
    
    public IssueBookTableModel() {

    }

    
    public IssueBookTableModel(Vector<Book> vectorBooks) {
        this.vectorBooks = vectorBooks;
    }

    @Override
    public int getRowCount() {
        if (vectorBooks != null) {
            return vectorBooks.size();
        } else {
            return 0;
        }
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object object = null;
        switch (columnIndex) {
            case 0:
                object = vectorBooks.get(rowIndex).getAuthor().getAuthorName();
                break;
            case 1:
                object = vectorBooks.get(rowIndex).getBookName();
                break;
            case 2:
                object = vectorBooks.get(rowIndex).getEdition();
                break;
        }
        return object;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";

        switch (columnIndex) {
            case 0:
                columnName = "Author Name";
                break;

            case 1:
                columnName = "Book Name";
                break;
            case 2:
                columnName = "Edition";
                break;
        }
        return columnName;
    }
    
}
