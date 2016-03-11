/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author User
 */
@Entity
@Table(name="type_doc")
public class Type_doc {
    
    @Id
    @Column(name="id_type_doc")
    private int id_type_doc;
    
    @Column(name="name")
    private String name;
    
    @Column(name="operacia")
    private int operacia;
    
    @Column(name="state")
    private int state;
}
