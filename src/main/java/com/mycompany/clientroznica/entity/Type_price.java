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

    public Type_price() {
    }

    public Type_price(String name, Val val) {
        this.name = name;
        this.val = val;
    }
    
    @Id
    @Column(name="id_price")
    private int id_price;
    
    @Column(name="name")
    private String name;
    
    @ManyToOne
    @JoinColumn(name="id_val")
    private Val val;
    
    @Column(name="state")
    private Integer state;

    public String getName() {
        return name;
    }

    public Val getVal() {
        return val;
    }


}
