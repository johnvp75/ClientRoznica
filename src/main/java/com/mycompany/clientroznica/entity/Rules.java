package com.mycompany.clientroznica.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

@Entity
@Table(name="rules")
public class Rules {
    
    @Id
    @Column(name="id_rules")
    private int id_rules;
    
    @Column(name="name")
    private String name;
    
    @Column(name="id_doc")
    private int id_doc;
    
    @Column(name="state")
    private int state;
}
