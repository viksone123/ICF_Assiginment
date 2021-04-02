package org.spring.employee.controller;

import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories
(entityManagerFactoryRef = "cellEntityManagerFactory",
basePackages = {"org.spring.employee.repositry" })
public class EmpConfiguration {

	@Primary
	@Bean(name = "dataSource",destroyMethod = "close")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() throws SQLException
	{
		return DataSourceBuilder.create().build();
		 }

	@Primary
	@Bean(name="cellEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder builder,
			@Qualifier("dataSource") DataSource dataSource) {

		return builder
				.dataSource(dataSource)
				.packages("org.spring.employee.entity")
				.persistenceUnit("alert")
				.build();
		}
}