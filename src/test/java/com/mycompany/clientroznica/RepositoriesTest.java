/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica;




import com.mycompany.clientroznica.entity.GlassForShop;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.clientroznica.repositories.GlassForShopRepository;

/**
 *
 * @author User
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional
public class RepositoriesTest {
    
    
    private static final Logger LOG=LoggerFactory.getLogger(AppConfig.class);
    
    @Autowired
    private GlassForShopRepository glassForShopRepository;
    
    
    
   @Test
   public void testFindAll() {
       LOG.info("*********All GlassForShop**********");
       Iterable<GlassForShop> allGlasses = glassForShopRepository.findAll();
       
       for (GlassForShop glass:allGlasses){
           LOG.info(glass.getName());
       }
   }
   

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
