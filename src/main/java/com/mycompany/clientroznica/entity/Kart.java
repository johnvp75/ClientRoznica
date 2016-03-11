/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;


import java.sql.Date;
import javax.persistence.*;
import com.mycompany.clientroznica.entity.GroupId;
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
    

    @ManyToOne
    @JoinColumn(name="id_tovar")
    private Tovar tovar;
    
    

    @ManyToOne
    @JoinColumn(name="id_skl")
    private Sklad skl;
    

    @ManyToOne
    @JoinColumn(name="id_group")
    private GroupId group;
    
    @Column(name="cost")
    private double cost;
    
    @Column(name="day")
    private Date day;
    

    @ManyToOne
    @JoinColumn(name="id_val")
    private Val val;
    
    @Column(name="state")
    private int state;
    
}
