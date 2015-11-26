package com.prototype.merchant;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by david.hong on 25/11/2015.
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.prototype.merchant.domain.core.repository",
        entityManagerFactoryRef = "coreEntityManagerFactory",
        transactionManagerRef = "coreTransactionManager")
public class DataSourceCoreConfiguration {
    public static final String CORE = "core";

    @Bean(name = "coreDataSource")
    @ConfigurationProperties(prefix = "spring.datasource-core")
    public DataSource coreDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "coreEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean coreEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(coreDataSource())
                .packages("com.prototype.merchant.core.entity")
                .persistenceUnit(CORE)
                .build();
    }

    @Bean(name = "coreTransactionManager")
    public PlatformTransactionManager coreTransactionManager() {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setDataSource(coreDataSource());
        jpaTransactionManager.setPersistenceUnitName(CORE);
        return jpaTransactionManager;
    }
}
