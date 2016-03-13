/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import java.io.Serializable;
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

    public GroupId() {
    }

    public GroupId(String name, int parent_group, GroupSection section, int ban) {
        this.name = name;
        this.parent_group = parent_group;
        this.section = section;
        this.ban = ban;
    }
    
    @Id
    @Column(name="id_group")
    private Integer id_group;
    
    @Column(name="name")
    private String name;
    
    @Column(name="parent_group")
    private int parent_group;
    
    @ManyToOne
    @JoinColumn(name="id_section")
    private GroupSection section;
    
    @Column(name="ban")
    private int ban;
    
    @Column(name="state")
    private Integer state;

    public Integer getId_group() {
        return id_group;
    }

    public String getName() {
        return name;
    }

    public int getParent_group() {
        return parent_group;
    }

    public GroupSection getSection() {
        return section;
    }

    public int getBan() {
        return ban;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent_group(int parent_group) {
        this.parent_group = parent_group;
    }

    public void setSection(GroupSection section) {
        this.section = section;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }
    
    
}
