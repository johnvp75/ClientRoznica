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

    public GlassForShop() {
    }

    public GlassForShop(String name, String barcode, double price) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
    }
    @Id
    @Column(name="Id")
    private int id ;
    
    @Column(name="name")
    private String name;

    @Column(name="barcode")
    private String barcode;
    
    @Column(name="price")
    private double price;

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
    
}
