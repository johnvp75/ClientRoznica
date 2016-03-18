/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.visualforms;

import com.mycompany.clientroznica.AppConfig;
import java.lang.reflect.Method;
import javax.swing.JDialog;

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
        LOG.info("*****************Newbarcode*****************");
        try{
            Method method=MainFrame.class.getDeclaredMethod("generateNewBarcode", String.class,Integer.class);
            method.setAccessible(true);
            String ret=(String)method.invoke(mainFrame, "8510 Скидка Зима",2203000);
            LOG.info(ret);
        } catch(Exception ex){
            ex.printStackTrace();
        }
        LOG.info("*****************Newbarcode finish*****************");
    }
    
    @Test
    public void testGetCostFromName(){
        LOG.info("*****************getCostFromName*****************");
        try{
            Method method=MainFrame.class.getDeclaredMethod("getCostFromName", String.class);
            method.setAccessible(true);
            Double ret=(Double)method.invoke(mainFrame, "8510 Скидка Зима");
            LOG.info(ret.toString());
        } catch(Exception ex){
            ex.printStackTrace();
        }
        LOG.info("*****************getCostFromName finish*****************");
    }
    @Test
    public void testGetIdGroup(){
        LOG.info("*****************getCostFromName*****************");
        try{
            Method method=MainFrame.class.getDeclaredMethod("getIdGroup", String.class);
            method.setAccessible(true);
            Double ret=(Double)method.invoke(mainFrame, "1110 Бусы");
            LOG.info(ret.toString());
        } catch(Exception ex){
            ex.printStackTrace();
        }
        LOG.info("*****************getCostFromName finish*****************");
    }

}