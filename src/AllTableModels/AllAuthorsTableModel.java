/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTableModels;

import entity.Author;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author suhail
 */
public class AllAuthorsTableModel extends AbstractTableModel {

    private Vector<Author> vectorAuthors;
    private int i;

    public AllAuthorsTableModel() {
        i = 1;
    }

    public AllAuthorsTableModel(Vector<Author> vectorAuthors) {
        this.vectorAuthors = vectorAuthors;
    }

    @Override
    public int getRowCount() {
        return vectorAuthors.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object object = null;

        switch (columnIndex) {
            case 0:
                object = i++;
                break;
            case 1:
                object = vectorAuthors.get(rowIndex).getAuthorName();
                break;
            case 2:
                object = vectorAuthors.get(rowIndex).getEmail();
                break;
            case 3:
                object = vectorAuthors.get(rowIndex).getPhoneNumber();

        }
        return object;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";

        switch (columnIndex) {
            case 0:
                columnName = "s.no";
                break;
            case 1:
                columnName = "Author Name";
                break;
            case 2:
                columnName = "Email";
                break;
            case 3:
                columnName = "Phone Nuumber";
                break;
        }
         return columnName ;
    }
    
    
   
    }
    


