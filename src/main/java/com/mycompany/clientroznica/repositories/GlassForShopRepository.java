/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.GlassForShop;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;




/**
 *
 * @author User
 */

public interface GlassForShopRepository  extends PagingAndSortingRepository<GlassForShop, Integer>{
    
    public List<GlassForShop> findByNameLikeOrderByNameAsc(String likeName);
    
    
}
