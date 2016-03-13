/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;


import com.mycompany.clientroznica.entity.Sklad;
import org.springframework.data.repository.PagingAndSortingRepository;




/**
 *
 * @author User
 */

public interface SkladRepository  extends PagingAndSortingRepository<Sklad, Integer>{

//    public Iterable<Sklad> findAllOrderByNameDesc();
    
    
}
