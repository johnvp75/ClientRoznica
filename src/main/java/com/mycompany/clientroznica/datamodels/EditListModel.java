/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author евгений
 */

@Component
public class EditListModel extends AbstractListModel{

    private ArrayList list;

    public EditListModel() {
    }

    public void setList(ArrayList list) {
        this.list = list;
    }
    
    
    public int getSize() {
        return list.size();
    }

    public Object getElementAt(int index) {
        return list.get(index).toString();
    }
    
}
