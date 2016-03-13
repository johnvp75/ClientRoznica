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

    public Price() {
    }

    public Price(Tovar tovar, Sklad skl, Type_price type_price, double cost, int akciya, int isakcia) {
        this.tovar = tovar;
        this.skl = skl;
        this.type_price = type_price;
        this.cost = cost;
        this.akciya = akciya;
        this.isakcia = isakcia;
    }
    
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
    private Integer state;

    public Tovar getTovar() {
        return tovar;
    }

    public Sklad getSkl() {
        return skl;
    }

    public Type_price getType_price() {
        return type_price;
    }

    public double getCost() {
        return cost;
    }

    public int getAkciya() {
        return akciya;
    }

    public int getIsakcia() {
        return isakcia;
    }

    public void setType_price(Type_price type_price) {
        this.type_price = type_price;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAkciya(int akciya) {
        this.akciya = akciya;
    }

    public void setIsakcia(int isakcia) {
        this.isakcia = isakcia;
    }

    
}
