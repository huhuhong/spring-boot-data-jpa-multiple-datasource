package com.prototype.merchant.core.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by david.hong on 23/11/2015.
 */
@Entity
@Table(name = "Tenant")
public class Merchant {

    @Id
    //@Column(name="Id")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    //@Column(name="OrganizationCode")
    private String OrganizationCode;
    //@Column(name="ServerName")
    private String ServerName;

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        OrganizationCode = organizationCode;
    }

    public String getServerName() {
        return ServerName;
    }

    public void setServerName(String serverName) {
        ServerName = serverName;
    }


}
