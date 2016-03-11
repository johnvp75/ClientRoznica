/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.GlassForShop;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



/**
 *
 * @author User
 */

public interface GlassForShopRepository  extends CrudRepository<GlassForShop, Integer>{
    
    
}
