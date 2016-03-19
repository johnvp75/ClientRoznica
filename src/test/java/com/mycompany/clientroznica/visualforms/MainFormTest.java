/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.visualforms;

import com.mycompany.clientroznica.AppConfig;
import com.mycompany.clientroznica.datamodels.TableData;
import com.mycompany.clientroznica.datamodels.TableRecord;
import com.mycompany.clientroznica.entity.Bar_code;
import com.mycompany.clientroznica.entity.GlassForShop;
import com.mycompany.clientroznica.entity.GroupId;
import com.mycompany.clientroznica.entity.Kart;
import com.mycompany.clientroznica.entity.Price;
import com.mycompany.clientroznica.entity.Sklad;
import com.mycompany.clientroznica.entity.Tovar;
import com.mycompany.clientroznica.entity.Val;
import java.lang.reflect.Method;
import java.sql.Date;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JTextField;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class MainFormTest {
    
    private static final Logger LOG=LoggerFactory.getLogger(AppConfig.class);
    
    @Autowired
    MainFrame mainFrame;
    
    public MainFormTest() {
    }
    
    @Test
    public void testGenerateNewBarcode(){
        LOG.info("*****************Add*****************");
        try{
            String name="8510 Шпильки";
/*            LOG.info("getIdGroup start");
            Method method=MainFrame.class.getDeclaredMethod("getIdGroup", String.class);
            method.setAccessible(true);
            GroupId group=(GroupId)method.invoke(mainFrame,name);
            LOG.info("getIdGroup "+group.getGroup());
            method=MainFrame.class.getDeclaredMethod("generateNewBarcode", String.class,Integer.class);
            method.setAccessible(true);
            String barcode=(String)method.invoke(mainFrame,name, group.getGroup());
            LOG.info("generateNewBarcode "+barcode);

            Method method=MainFrame.class.getDeclaredMethod("getSklad", String.class);
            method.setAccessible(true);
            Sklad sklad =(Sklad) method.invoke(name);
            LOG.info("getSklad "+sklad.getName());
            method=MainFrame.class.getDeclaredMethod("getCostFromName", String.class);
            method.setAccessible(true);
            Double cost=((Integer)method.invoke(mainFrame,name)).doubleValue();
            LOG.info("getCostFromName "+cost);
 //           method=MainFrame.class.getDeclaredMethod("generateArticle", Integer.class,GroupId.class);
//            method.setAccessible(true);
//            String article=(String)method.invoke(mainFrame, cost.intValue(), group);
//            LOG.info("generateArticle "+article);
*/
//            Method method=MainFrame.class.getDeclaredMethod("addNewPosition", String.class);
            Method method=MainFrame.class.getDeclaredMethod("addNewPosition", String.class);
            method.setAccessible(true);
            method.invoke(mainFrame, name);
            LOG.info("Test passed");
        } catch(Exception ex){
            ex.printStackTrace();
        }
        LOG.info("*****************Add finish*****************");
    }
    
 

}