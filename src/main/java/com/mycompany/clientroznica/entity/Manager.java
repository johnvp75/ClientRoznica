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

    public Manager() {
    }

    public Manager(Rules rules, String name, String password) {
        this.rules = rules;
        this.name = name;
        this.password = password;
    }
    
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
    private Integer state;

    public Rules getRules() {
        return rules;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Date getDay() {
        return day;
    }

    public int getComplete() {
        return complete;
    }

    public String getText() {
        return text;
    }

    public void setRules(Rules rules) {
        this.rules = rules;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public void setText(String text) {
        this.text = text;
    }
    
}
