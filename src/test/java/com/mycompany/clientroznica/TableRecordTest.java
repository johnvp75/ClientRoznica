/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica;

import com.mycompany.clientroznica.datamodels.TableRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class TableRecordTest {
    
    private static final Logger LOG=LoggerFactory.getLogger(AppConfig.class);
    
    
    @Test
    public void testCompare(){
        TableRecord item1=new TableRecord("Я Проба сортировки", "113568875", 5, 1.25,"02");
        TableRecord item2=new TableRecord("A Проба сортировки", "116838875", 1, 9.40,"04");
        LOG.info("Проверка сравнения должен быть положительный результат"+item1.compareTo(item2));
        LOG.info("Проверка сравнения должен быть отрицательный результат"+item2.compareTo(item1));
    }
    
}
