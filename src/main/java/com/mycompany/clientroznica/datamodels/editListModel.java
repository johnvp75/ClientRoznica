/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

import java.util.List;
import javax.swing.AbstractListModel;
import org.springframework.stereotype.Component;

/**
 *
 * @author евгений
 */

@Component
public class editListModel extends AbstractListModel{

    private List list;

    public editListModel() {
    }
    
    public editListModel(List list) {
        
        this.list=list;
    }

    public int getSize() {
        return list.size();
    }

    public Object getElementAt(int index) {
        return list.get(index).toString();
    }
    
}
