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
@Table(name="sklad")
public class Sklad {
    
    @Id
    @Column(name="id_skl")
    private int id_skl;
    
    @Column(name="name")
    private String name;
    
    @Column(name="id_price")
    private int id_price;
    
    @Column(name="state")
    private int state;
}