package com.prototype.merchant.domain.local.repository;

import com.prototype.merchant.local.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by david.hong on 25/11/2015.
 */
public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    @Query(value = "SELECT Id as id,Code as code ,Name as name FROM dbo.Organization WHERE IsDeleted = 0", nativeQuery = true)
    List<Organization> findAll();
}
