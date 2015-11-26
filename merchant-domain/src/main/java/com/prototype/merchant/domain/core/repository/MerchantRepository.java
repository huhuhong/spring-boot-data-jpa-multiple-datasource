package com.prototype.merchant.domain.core.repository;

import com.prototype.merchant.core.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by david.hong on 23/11/2015.
 */
public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
    @Query(value = "SELECT  Id as id,OrganizationCode as organization_code,ServerName as server_name FROM dbo.Tenant where IsDeleted = 0 AND OrganizationCode=?1", nativeQuery = true)
    Merchant findByOrganizationCode(String organizationCode);

    //@Query(value = "SELECT  Id as id,OrganizationCode as organization_code,ServerName as server_name FROM dbo.Tenant where IsDeleted = 0 AND id=?1", nativeQuery = true)
    @Query(value = "SELECT Id,OrganizationCode,ServerName FROM dbo.Tenant where IsDeleted = 0 AND id=?1", nativeQuery = true)
    Merchant findById(String id);

    //@Query(value = "SELECT Id as id, OrganizationCode as organization_code,ServerName as server_name FROM dbo.Tenant WHERE IsDeleted = 0", nativeQuery = true)
    @Query(value = "SELECT Id , OrganizationCode ,ServerName  FROM dbo.Tenant WHERE IsDeleted = 0", nativeQuery = true)
    List<Merchant> findAll();
}
