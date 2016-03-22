/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.Kart;
import javassist.compiler.ast.IntConst;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author User
 */
public interface KartRepository extends CrudRepository<Kart, Integer>{
   
    @Query("select max(k.id_nom)+1 from Kart k")
    public int getNextId();
}
