/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import com.mycompany.clientroznica.repositories.TovarRepository;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author User
 */

@Entity
@Table(name = "Tovar")
public class Tovar {

 
    
    public Tovar() {
    }

    public Tovar(String name, int kol) {
        this.name = name;
        this.kol = kol;
        
    }
    
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
    private Integer state;

    public String getName() {
        return name;
    }

    public int getKol() {
        return kol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }
    
   



}
