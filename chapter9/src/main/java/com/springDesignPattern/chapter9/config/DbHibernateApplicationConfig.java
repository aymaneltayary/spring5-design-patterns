/**
 * 
 */
package com.springDesignPattern.chapter9.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.PoolingDataSource;
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

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.PooledDataSource;

/**
 * @author aeltayary
 *
 */
//@Configuration
@PropertySource("config.properties")
public class DbHibernateApplicationConfig {
	/**
	 * 
	 * @param driver
	 * @param url
	 * @param user
	 * @param pass
	 * @return
	 * @throws PropertyVetoException
	  */ 
	 @Bean public DataSource hibernateDatasource(@Value("${db.mysql.driver}")
	       String driver, @Value("${db.mysql.url}") String
	       url, @Value("${db.mysql.user}") String
	       user, @Value("${db.mysql.password}") String pass) throws
	       PropertyVetoException { 
		 ComboPooledDataSource ds = new ComboPooledDataSource(); 
		 ds.setDriverClass(driver); 
		 ds.setJdbcUrl(url);
	     ds.setUser(user); 
	     ds.setPassword(user); 
	     ds.setInitialPoolSize(5);
	     ds.setMaxPoolSize(10); 
	     ds.setMaxIdleTime(10); 
	     return ds; 
	     }
	


	

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource ds) {

		return new JdbcTemplate(ds);

	}

}
