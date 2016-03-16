/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.GroupId;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author User
 */
public interface GroupRepository extends PagingAndSortingRepository<GroupId,Integer> {
    
    public Iterable<GroupId> findByNameLikeAndParentgroup(String likeName,int parentgroup);
    
    public GroupId getByNameLikeAndParentgroup(String likeName,int parentgroup);
    
}
