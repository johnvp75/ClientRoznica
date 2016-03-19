/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
package com.mycompany.clientroznica.datamodels;

import com.mycompany.clientroznica.AppConfig;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author евгений
 */

@Component
public class EditListModel extends AbstractListModel{

    final static private Logger LOG=LoggerFactory.getLogger(AppConfig.class);
    private ArrayList list;

    public EditListModel() {
    }

    public void setList(ArrayList list) {
        this.list=new ArrayList();
        this.list.clear();
        this.list = list;
    }
    
    
    public int getSize() {
        return list.size();
    }

    public Object getElementAt(int index) {
        LOG.info(list.get(index).toString());
        return list.get(index).toString();
    }
    
    
}
