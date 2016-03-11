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
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="price")
public class Price {
    
    @Id
    @Column(name="id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name="id_tovar")
    private Tovar tovar;
    
    @ManyToOne
    @JoinColumn(name="id_skl")
    private Sklad skl;
    
    @ManyToOne
    @JoinColumn(name="id_price")
    private Type_price type_price;
    
    @Column(name="cost")
    private double cost;
    
    @Column(name="akciya")
    private int akciya;
    
    @Column(name="isakcia")
    private int isakcia;
    
    @Column(name="state")
    private int state;
    
}
