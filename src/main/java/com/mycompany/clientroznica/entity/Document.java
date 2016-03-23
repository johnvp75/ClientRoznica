/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "document")
public class Document {
    
    @Id
    @Column(name="id_doc")
    private long id;
    
    @Column(name = "numb")
    private int numb;
    
    @Column(name = "day")
    private Date day;
    
    @Column(name = "sum")
    private double sum;
    
    @Column(name = "note")
    private String note;
    
    @Column(name = "disc")
    private int disc;
    
    @Column(name = "numb1")
    private int numb1;
    
    @Column(name = "checknumb")
    private int checknumb;
    
    @ManyToOne
    @JoinColumn(name = "id_type_doc")
    private Type_doc type_doc;
    
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    
    @ManyToOne
    @JoinColumn(name = "id_skl")
    private Sklad sklad;
    
    @ManyToOne
    @JoinColumn(name = "id_manager")
    private Manager manager;
    
    @ManyToOne
    @JoinColumn(name = "id_val")
    private Val val;
    
    @ManyToOne
    @JoinColumn(name = "id_price")
    private Price price;
    
    
    
    
}
