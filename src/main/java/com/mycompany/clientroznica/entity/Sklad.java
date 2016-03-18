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
@Table(name="sklad")
public class Sklad {

    public Sklad() {
    }

    public Sklad(String name, Type_price type_price) {
        this.name = name;
        this.type_price = type_price;
    }
    
    @Id
    @Column(name="id_skl")
    private int id_skl;
    
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }
    
    @ManyToOne
    @JoinColumn(name="id_price")
    private Type_price type_price;
    
    @Column(name="state")
    private Integer state;

    public Type_price getType_price() {
        return type_price;
    }

    public int getId_skl() {
        return id_skl;
    }

    @Override
    public String toString(){
        return getName().trim();
    }
    
    
    
}
