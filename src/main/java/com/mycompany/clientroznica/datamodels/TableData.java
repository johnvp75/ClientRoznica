/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author Евгений
 */
@Component
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
            case 0:
                return rowIndex+1;
            case 1:
                return record.getName();
            case 2:
                return record.getBar_code();
            case 3:
                return record.getCount();
            case 4:
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
            record.setCount(new Integer((String)aValue));
            records.set(rowIndex,(record));
        }
    }
    
    public int add(TableRecord record){
        records.add(record);
        fireTableDataChanged();
        return records.size()-1;
    }
    
    private int getIndexByName(TableRecord record){
        int index=-1;
        for(TableRecord item:records){
            if (item.getName().equals(record.getName()))
                index=records.indexOf(item);
        }
        return index;
    }
    
}
