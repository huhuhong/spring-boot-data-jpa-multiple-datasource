package com.prototype.merchant.controller;

import com.prototype.merchant.core.entity.Merchant;
import com.prototype.merchant.domain.core.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by david.hong on 24/11/2015.
 */
@RestController
@RequestMapping(value = "/api/v1/merchants", produces = MediaType.APPLICATION_JSON_VALUE)
public class MerchantController {

    @Autowired
    public MerchantRepository merchantRepository;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Merchant> GetList()
    {
        return this.merchantRepository.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Merchant GetMerchantById(@PathVariable("id") String id)
    {
        return this.merchantRepository.findById(id);
    }

    @RequestMapping(value = "{organizationCode}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Merchant GetById(@PathVariable("organizationCode") String organizationCode)
    {
        return this.merchantRepository.findByOrganizationCode(organizationCode);
    }

    @RequestMapping(method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Merchant CreateMerchant(@RequestBody Merchant tenant)
    {
        return this.merchantRepository.findByOrganizationCode("AFNZ");
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Merchant UpdateeMerchant(@PathVariable("id") String id, @RequestBody Merchant tenant)
    {
        return this.merchantRepository.findByOrganizationCode("AFNZ");
    }

}
