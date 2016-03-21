/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica;




import com.mycompany.clientroznica.entity.GlassForShop;
import com.mycompany.clientroznica.entity.Sklad;
import com.mycompany.clientroznica.entity.Tovar;

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
import com.mycompany.clientroznica.repositories.TovarRepository;
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
    
    @Autowired
    private TovarRepository tovarRepository;
    
    
/*    
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
       LOG.info("*********Barcodes from glassforshop like 2203000**********");
       List<GlassForShop> elements;
       Integer group=2203000; 
       elements = glassForShopRepository.findByBarcodeLikeOrderByBarcodeDesc(group+"%");
        int num=new Integer(elements.get(0).getBarcode().substring(group.toString().length(),group.toString().length()+5));
       
       for (GlassForShop element:elements){
           LOG.info(element.getName()+" barcodes "+element.getBarcode()+": "+num);
       }
   }
*/
    
 
    @Test
    public void testSaveWithNullId(){
       LOG.info("*************saveWithNullId Start Test");
       Tovar tovar=new Tovar("Проба записи", 1);
       tovarRepository.save(tovar);
       tovar=tovarRepository.getByNameLike(tovar.getName()+"%");

       LOG.info(tovar.getName());

       LOG.info("*************saveWithNullId End Test");
       
    }
}
