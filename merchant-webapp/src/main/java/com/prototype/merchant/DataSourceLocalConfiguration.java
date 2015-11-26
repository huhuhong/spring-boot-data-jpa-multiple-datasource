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
@EnableJpaRepositories(basePackages = "com.prototype.merchant.domain.local.repository",
        entityManagerFactoryRef = "internalEntityManagerFactory",
        transactionManagerRef = "internalTransactionManager")
public class DataSourceLocalConfiguration {

    public static final String INTERNAL = "local";

    @Bean(name = "internalDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource-local")
    public DataSource internalDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "internalEntityManagerFactory")
    @Primary
    public LocalContainerEntityManagerFactoryBean internalEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(internalDataSource())
                .packages("com.prototype.merchant.local.entity")
                .persistenceUnit(INTERNAL)
                .build();
    }

    @Bean(name = "internalTransactionManager")
    @Primary
    public PlatformTransactionManager internalTransactionManager() {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setDataSource(internalDataSource());
        jpaTransactionManager.setPersistenceUnitName(INTERNAL);
        return jpaTransactionManager;
    }
}
