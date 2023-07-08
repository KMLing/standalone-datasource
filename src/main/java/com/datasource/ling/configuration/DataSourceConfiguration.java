package com.solt.jdc.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {


    @Bean
    public DataSource dataSource(){
        BasicDataSource basicDataSource=new BasicDataSource();
        basicDataSource.setDriverClassName("org.hsqldb.jdbcDriver");
        basicDataSource.setUrl("jdbc:hsql:mem:localhost");
        return basicDataSource;
    }
}