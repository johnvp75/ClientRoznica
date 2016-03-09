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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name="groupid")
public class GroupId {
    
    @Id
    @Column(name="id_group")
    @OneToMany
    private int id_group;
    
    @Column(name="name")
    private String name;
    
    @Column(name="parent_group")
    private int parent_group;
    
    @Column(name="id_section")
    @ManyToOne
    @JoinColumn(table="groupsection",name="id_section")
    private int id_section;
    
    @Column(name="ban")
    private int ban;
    
    @Column(name="state")
    private int state;
    
}
