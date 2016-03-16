/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.AppConfig;
import com.mycompany.clientroznica.entity.GroupId;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author User
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@Transactional

public class GroupRepositoryTest {

    private static final Logger LOG=LoggerFactory.getLogger(AppConfig.class);
    
    @Autowired
    GroupRepository groupRepository;
    
    
    @Test
    public void testFindByNameLikeAndParent_group() {
        LOG.info("findByNameLikeAndParent_group");
        String likeName = "%Браслет%";
        int parent_group = 13000;
 /*       Iterable<GroupId> groups=groupRepository.findByNameLikeAndParentgroup(likeName, parent_group);
        for (GroupId group:groups){
            LOG.info(group.getName());
        }*/
        try{
            GroupId group=groupRepository.getByNameLikeAndParentgroup(likeName, parent_group);
            LOG.info(group.getName());
        }catch(NullPointerException ex){
            LOG.info("null");
        }
    }


}
