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

    public GroupId(String name, Integer parentgroup, GroupSection section, int ban) {
        this.name = name;
        this.parentgroup = parentgroup;
        this.section = section;
        this.ban = ban;
    }

    public GroupId(Integer group) {
        this.group = group;
    }

    public GroupId(Integer group, String name) {
        this.group = group;
        this.name = name;
    }
    
    
    
    @Id
    @Column(name="id_group")
    private Integer group;
    
    @Column(name="name")
    private String name;
    
    @Column(name="parent_group")
    private Integer parentgroup;
    
    @ManyToOne
    @JoinColumn(name="id_section")
    private GroupSection section;
    
    @Column(name="ban")
    private Integer ban;
    
    @Column(name="state")
    private Integer state;

    public Integer getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Integer getParentgroup() {
        return parentgroup;
    }

    public GroupSection getSection() {
        return section;
    }

    public Integer getBan() {
        return ban;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentgroup(Integer parentgroup) {
        this.parentgroup = parentgroup;
    }

    public void setSection(GroupSection section) {
        this.section = section;
    }

    public void setBan(Integer ban) {
        this.ban = ban;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
    
    
}
