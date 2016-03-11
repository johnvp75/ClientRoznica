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
    private Integer id ;
    
    @Column(name="name")
    private String name;

    public String getName() {
        return name;
    }
    
    @Column(name="barcode")
    private String barcode;
    
    @Column(name="price")
    private double price;
    
    
    
}
