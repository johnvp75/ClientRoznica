/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */

@Entity
@Table(name="groupsection")
public class GroupSection {

    public GroupSection() {
    }

    public GroupSection(String description) {
        this.description = description;
    }
    
    @Id
    @Column(name="id_section")
    private int id_section;
    
    @Column(name="description")
    private String description;
    
    @Column(name="state")
    private Integer state;

    public String getDescription() {
        return description;
    }
    
}
