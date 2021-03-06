/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica;




import com.mycompany.clientroznica.entity.GlassForShop;
import com.mycompany.clientroznica.entity.Sklad;
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
import com.mycompany.clientroznica.repositories.SkladRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.springframework.data.domain.Sort;

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
    
    @Autowired
    private SkladRepository skladRepository;
    
    
    
   @Test
   public void testFindAllGlassForShop() {
       LOG.info("*********All GlassForShop**********");
       Iterable<GlassForShop> allGlasses = glassForShopRepository.findAll();
       
       for (GlassForShop glass:allGlasses){
           LOG.info(glass.getName());
       }
   }
   

   @Test
   public void testFindAllSklad() {
       LOG.info("*********All Sklad**********");
       Iterable<Sklad> allSklads;
        allSklads = skladRepository.findAll(new Sort(Sort.Direction.ASC,"name"));
       
       for (Sklad sklad:allSklads){
           LOG.info(sklad.getName());
       }
   }

   @Test
   public void testFindNameLike() {
       LOG.info("*********name from glassforshop like 10**********");
       Iterable<GlassForShop> elements;
        elements = glassForShopRepository.findByNameLikeOrderByNameAsc("10%");
       
       for (GlassForShop element:elements){
           LOG.info(element.getName());
       }
   }
   
    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
