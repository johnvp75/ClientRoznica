/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
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

    public GlassForShop(String name, String barcode, double price, Sklad sklad) {
        this.name = name;
        this.barcode = barcode;
        this.price = price;
        this.sklad=sklad;
    }
    @Id    
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "GLASSFORSHOP_SEQ")
    private int id ;
    
    @Column(name="name")
    private String name;

    @Column(name="barcode")
    private String barcode;
    
    @Column(name="price")
    private double price;
    
    @ManyToOne
    @JoinColumn(name="id_skl")
    private Sklad sklad;

    public Sklad getSklad() {
        return sklad;
    }

    public void setSklad(Sklad sklad) {
        this.sklad = sklad;
    }

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
