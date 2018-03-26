package com.automaticamusements.app.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource({"classpath:app.properties"})
public class DatabaseConfig {
    @Value("${spring.datasource.url}")
    String databaseUrl;

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        System.out.println("Database URL? " + databaseUrl);
        return DataSourceBuilder.create().build();
    }
}
