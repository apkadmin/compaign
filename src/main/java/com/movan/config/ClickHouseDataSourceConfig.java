package com.movan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author annguyen
 */


@Configuration
@ComponentScan(basePackages = { "com.movan" })
@PropertySource("classpath:application-clickhouse.properties")
@EnableTransactionManagement
public class ClickHouseDataSourceConfig {
    @Autowired
    private Environment environment;
    @Bean
    @ConfigurationProperties(prefix = "spring.clickhouse")
    public  DataSource clickHouseDataSource ()throws Exception {
        final DriverManagerDataSource dataSource = new  DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getProperty("spring.clickhouse.driver-class-name"));
        dataSource.setUrl(environment.getProperty("spring.clickhouse.jdbc-url"));
        dataSource.setUsername(environment.getProperty("spring.clickhouse.username"));
        dataSource.setPassword(environment.getProperty("spring.clickhouse.password"));
        return dataSource;
    }
}