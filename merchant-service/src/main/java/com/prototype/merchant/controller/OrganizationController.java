package com.prototype.merchant.controller;

import com.prototype.merchant.domain.local.repository.OrganizationRepository;
import com.prototype.merchant.local.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by david.hong on 25/11/2015.
 */
@RestController
@RequestMapping(value = "/api/v1/organizations", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrganizationController {

    @Autowired
    public OrganizationRepository organizationRepository;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Organization> GetList()
    {
        return this.organizationRepository.findAll();
    }
}
