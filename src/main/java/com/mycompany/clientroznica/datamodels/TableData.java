/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

import com.mycompany.clientroznica.TableRecord;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Евгений
 */
public class TableData extends AbstractTableModel{

    private List<TableRecord> records=new ArrayList<TableRecord>();
    public int getRowCount() {
        return records.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        TableRecord record=records.get(rowIndex);
        switch (columnIndex){
            case 1:
                return rowIndex+1;
            case 2:
                return record.getName();
            case 3:
                return record.getBar_code();
            case 4:
                return record.getCount();
            case 5:
                return record.getCost();
             
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "№";
            case 1:
                return "Название";
            case 2:
                return "Штрих-код";
            case 3:
                return "Кол-во";
            case 4:
                return "Цена";
        }
        return super.getColumnName(column);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex==3?true:false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if(columnIndex==3){
            TableRecord record=records.get(rowIndex);
            record.setCount((Integer)aValue);
            records.set(rowIndex,(record));
        }
    }
    
    
}
