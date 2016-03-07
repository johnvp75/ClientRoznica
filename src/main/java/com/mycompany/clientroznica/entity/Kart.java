/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table(name="kart")
public class Kart {
    
    @Id
    @Column(name="id_nom")
    private int id_nom;
    
    @Column(name="id_tovar")
    private int id_tovar;
    
    @Column(name="id_skl")
    private int id_skl;
    
    @Column(name="id_group")
    private int id_group;
    
    @Column(name="cost")
    private double cost;
    
    @Column(name="day")
    private date day;
    
    @Column(name="val")
    private int val;
    
    @Column(name="state")
    private int state;
    
}
