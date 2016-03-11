/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table(name="manager")
public class Manager {
    
    @Id
    @Column(name="id_manager")
    private int id_manager;
    
    @ManyToOne
    @JoinColumn(name = "id_rules")
    private Rules rules;
    
    @Column(name="name")
    private String name;
    
    @Column(name="password")
    private String password;
    
    @Column(name="day")
    private Date day;
    
    @Column(name="complete")
    private int complete;
    
    @Column(name="test")
    private String text;
    
    @Column(name="state")
    private int state;
    
}
