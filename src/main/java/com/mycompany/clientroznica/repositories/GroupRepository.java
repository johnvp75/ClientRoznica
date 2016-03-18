/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clientroznica.repositories;

import com.mycompany.clientroznica.entity.GroupId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author User
 */
public interface GroupRepository extends PagingAndSortingRepository<GroupId,Integer> {
    
    public Iterable<GroupId> findByNameLikeAndParentgroup(String likeName,int parentgroup);
    
    @Query("SELECT g FROM GroupId g WHERE TRIM(g.name) like :suffix AND g.parentgroup = :parentgroup")
    public GroupId getByNameSuffixAndParentgroup(@Param("suffix")String suffix,@Param("parentgroup") int parentgroup);
    
}
