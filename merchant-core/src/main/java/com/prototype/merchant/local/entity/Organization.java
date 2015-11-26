package com.prototype.merchant.local.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by david.hong on 25/11/2015.
 */
@Entity
@Table(name = "Organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name="Id")
    private long id;
    //@Column(name="Code")
    private String code;
    //@Column(name="Name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
