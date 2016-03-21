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
    
//    @Query("Insert into Tovar (id_tovar,name,kol) select max(t.id_tovar)+1 as id_tovar, :tovar.name ,:tovar.kol from Tovar t")
//    public void saveWithNullId(@Param("tovar") Tovar tovar);
    
}
