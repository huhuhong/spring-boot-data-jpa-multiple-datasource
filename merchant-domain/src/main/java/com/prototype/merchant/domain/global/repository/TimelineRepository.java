package com.prototype.merchant.domain.global.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;

/**
 * Created by david.hong on 26/11/2015.
 */
public interface TimelineRepository extends CassandraRepository<Timeline> {
    @Query("select event_id,event_type from events")
    List<Timeline> findAll();
}
