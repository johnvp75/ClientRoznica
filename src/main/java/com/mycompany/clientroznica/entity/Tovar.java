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
@Table(name = "Tovar")
public class Tovar {
    
    @Id
    @Column(name = "id_tovar")
    private int id_tovar;
    
    @Column(name="name")
    private String name;
    
    @Column(name="kol")
    private int kol;
    
    @Column(name="id_color")
    private  int id_color;
    
    @Column(name="state")
    private int state;
}
