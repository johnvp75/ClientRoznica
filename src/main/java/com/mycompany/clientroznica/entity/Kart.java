/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;


import java.sql.Date;
import javax.persistence.*;

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
    @ManyToOne
    @JoinColumn(table="tovar",name="id_tovar")
    private int id_tovar;
    
    
    @Column(name="id_skl")
    @ManyToOne
    @JoinColumn(table="sklad",name="id_skl")
    private int id_skl;
    
    @Column(name="id_group")
    @ManyToOne
    @JoinColumn(table="groupid",name="id_group")
    private int id_group;
    
    @Column(name="cost")
    private double cost;
    
    @Column(name="day")
    private Date day;
    
    @Column(name="val")
    @ManyToOne
    @JoinColumn(table="val",name="id_val")
    private int val;
    
    @Column(name="state")
    private int state;
    
}
