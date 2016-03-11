/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Евгений
 */
@Entity
@Table(name="Bar_code")
public class Bar_code {
    
    @Id
    @Column(name="id")
    private long id;
    
    @Column(name="bar_code")
    private String bar_code;

    @ManyToOne
    @JoinColumn(name="id_tovar")
    private Tovar tovar;
    
    @ManyToOne
    @JoinColumn(name="id_skl")
    private Sklad skl;
    
    @Column(name = "count")
    private int count;
    
    @Column(name = "for_shops")
    private int for_shop;
    
    @Column(name = "state")
    private int state;
    
}
