/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "client")
class Client {
    
    @Id
    @Column(name = "id_client")
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "my_entity_seq_gen")
//    @SequenceGenerator(name = "my_entity_seq_gen", sequenceName = "CLIENT_SEQ")
    private int id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="adres")
    private String adres;
    
    @Column(name="phone")
    private String phone;
    
    @Column(name="type")
    private int type;

    @Column(name="day")
    private Date day;
    
    @Column(name="state")
    private int state;
    
    @Column(name="editing")
    private int editing;

}
