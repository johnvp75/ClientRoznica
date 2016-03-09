/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table(name="type_price")
public class Type_price {
    
    @Id
    @Column(name="id_price")
    @OneToMany
    private int id_price;
    
    @Column(name="name")
    private String name;
    
    @Column(name="id_val")
    @ManyToOne
    @JoinColumn(table="val",name="id_val")
    private int id_val;
    
    @Column(name="state")
    private int state;
}
