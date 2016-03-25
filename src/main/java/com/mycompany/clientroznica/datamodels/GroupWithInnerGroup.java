/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.datamodels;

import com.mycompany.clientroznica.entity.GroupId;

/**
 *
 * @author User
 */
public class GroupWithInnerGroup extends GroupId{

    public GroupWithInnerGroup() {
    }

    
    public GroupWithInnerGroup(Integer group, String name) {
        super(group, name);
        this.innerGroup = name.substring(0,2);
    }
    

    
    private String innerGroup;

    public String getInnerGroup() {
        return innerGroup;
    }

    public void setInnerGroup(String innerGroup) {
        this.innerGroup = innerGroup;
    }
    
    @Override
    public void setName(String name){
        super.setName(name);
        setInnerGroup(getName().substring(0,2));
    }
}
