package com.prototype.merchant.controller;

import com.prototype.merchant.domain.global.repository.Timeline;
import com.prototype.merchant.domain.global.repository.TimelineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by david.hong on 26/11/2015.
 */
@RestController
@RequestMapping(value = "/api/v1/transactions", produces = MediaType.APPLICATION_JSON_VALUE)
public class TimelineController {
    @Autowired
    public TimelineRepository timelineRepository;

    @RequestMapping(method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Timeline> GetList()
    {
        return this.timelineRepository.findAll();
    }
}
