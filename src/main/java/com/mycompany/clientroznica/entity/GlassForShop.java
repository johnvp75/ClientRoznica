/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Евгений
 */
@Entity
@Table(name="GlassForShop")
public class GlassForShop {
    @Id
    @Column(name="Id")
    private long id ;
    
    @Column(name="name")
    private String name;
    
    @Column(name="barcode")
    private String barcode;
    
    @Column(name="cost")
    private double cost;
    
}
