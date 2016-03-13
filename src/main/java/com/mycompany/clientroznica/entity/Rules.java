package com.mycompany.clientroznica.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    public Rules() {
    }

    public Rules(String name, int id_doc, Integer state) {
        this.name = name;
        this.id_doc = id_doc;
        this.state = state;
    }
    
    @Id
    @Column(name="id_rules")
    private int id_rules;
    
    @Column(name="name")
    private String name;
    
    @Column(name="id_doc")
    private int id_doc;
    
    @Column(name="state")
    private Integer state;

    public String getName() {
        return name;
    }

    public int getId_doc() {
        return id_doc;
    }

    public void setId_rules(int id_rules) {
        this.id_rules = id_rules;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
