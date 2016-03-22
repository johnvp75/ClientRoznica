/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Евгений
 */
@Entity
@Table(name="Bar_code")
public class Bar_code {

    public Bar_code() {
    }

    public Bar_code(String bar_code, Tovar tovar, Sklad skl, int count, int for_shop) {
        this.bar_code = bar_code;
        this.tovar = tovar;
        this.skl = skl;
        this.count = count;
        this.for_shop = for_shop;
    }
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "BAR_CODE_SEQ")
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
    private Integer state;

    public String getBar_code() {
        return bar_code;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public Sklad getSkl() {
        return skl;
    }

    public int getCount() {
        return count;
    }

    public int getFor_shop() {
        return for_shop;
    }
    
    
}
