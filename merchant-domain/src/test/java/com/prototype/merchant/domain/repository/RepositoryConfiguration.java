package com.prototype.merchant.domain.repository;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by david.hong on 24/11/2015.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.prototype.merchant"})
@EnableJpaRepositories(basePackages = {"com.prototype.merchant"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
