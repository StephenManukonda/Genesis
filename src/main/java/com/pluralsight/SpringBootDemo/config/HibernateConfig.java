package com.pluralsight.SpringBootDemo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	@Value("${spring.datasource.url}")
	private String URL;

	@Value("${spring.datasource.username}")
	private String USER;

	@Value("${spring.datasource.password}")
	private String PASSWORD;

	@Value("${spring.datasource.driverClassName}")
	private String DRIVER;

	@Value("${spring.jpa.database-platform}")
	private String DIALECT;

	@Value("${spring.jpa.show-sql}")
	private String SHOW_SQL;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String DLL;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(URL);
		dataSource.setUrl(USER);
		dataSource.setPassword(PASSWORD);
		dataSource.setDriverClassName(DRIVER);
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactoryBuilder() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		Properties properties = new Properties();
		properties.put("spring.jpa.database-platform", DIALECT);
		properties.put("spring.jpa.show-sql", SHOW_SQL);
		properties.put("spring.jpa.hibernate.ddl-auto", DLL);
		sessionFactory.setHibernateProperties(properties);
		return sessionFactory;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sessionFactoryBuilder().getObject());
		return transactionManager;

	}

}
