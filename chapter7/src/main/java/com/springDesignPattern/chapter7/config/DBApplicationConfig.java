/**
 * 
 */
package com.springDesignPattern.chapter7.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author aeltayary
 *
 */
@Configuration
@PropertySource("config.properties")
public class DBApplicationConfig {

	@Bean
	public DataSource dataSource(@Value("${db.mysql.driver}") String driver, @Value("${db.mysql.url}") String url,
			@Value("${db.mysql.user}") String user, @Value("${db.mysql.password}") String pass) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//SimpleDriverDataSource ds= new SimpleDriverDataSource();
		//SingleConnectionDataSource ds= new SingleConnectionDataSource()
		//EmbeddedDatabaseBuilder embds= new EmbeddedDatabaseBuilder();
		//embds.setType(EmbeddedDatabaseType.H2)
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(user);
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) { 
		return new JdbcTemplate(ds);

	}

@Bean
public PlatformTransactionManager transactionManager(DataSource ds) {
	return  new DataSourceTransactionManager(ds);
	
	
}

}
