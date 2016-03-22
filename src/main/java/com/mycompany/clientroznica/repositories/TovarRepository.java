/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.Tovar;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author User
 */
public interface TovarRepository extends CrudRepository<Tovar, Integer>{
    
    public Tovar getByNameLike(String likeName);
    
    @Query("Select t from Tovar t where trim(t.name)=:name")
    public Tovar getByNameTrim(@Param("name")String name);
    
    @Query("select max(t.id_tovar)+1 from Tovar t")
    public int getNextId();
    
}
