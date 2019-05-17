package com.taylor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;


@Configuration
public class JDBCConfig {
    @Bean
    public DataSource getDataSource(){

        DruidDataSource dataSource = new DruidDataSource();

        return dataSource;
    }

}
