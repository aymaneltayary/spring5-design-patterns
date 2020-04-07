/**
 * 
 */
package com.springDesignPattern.chapter9.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author aeltayary
 *
 */
@Configuration
@EnableTransactionManagement
@PropertySource("config.properties")
public class DbJpaApplicationConfig {

	/**
	 * set data source Apache DBCP
	 * 
	 * @param driver
	 * @param url
	 * @param user
	 * @param pass
	 * @return
	 */
	@Bean
	public DataSource datasource(@Value("${db.mysql.driver}") String driver, @Value("${db.mysql.url}") String url,
			@Value("${db.mysql.user}") String user, @Value("${db.mysql.password}") String pass) {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(user);
		ds.setPassword(user);
		ds.setInitialSize(5);
		ds.setMinIdle(5);
		ds.setMaxIdle(10);
		ds.setMaxOpenPreparedStatements(100);
		return ds;

	}

	/**
	 * 
	 * @param ds
	 * @return
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManager(DataSource ds) {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(ds);
		emf.setPackagesToScan("com.springDesignPattern.chapter9.entity");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(vendorAdapter);
		Map<String, String> jpaProperties = new HashMap<String, String>();
		jpaProperties.put("hibernate.show_sql", "true");
		emf.setJpaPropertyMap(jpaProperties);
		return emf;
	}

	/**
	 * 
	 * @param emf
	 * @return
	 */

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		JpaTransactionManager tm = new JpaTransactionManager();
		tm.setEntityManagerFactory(emf);
		return tm;

	}


}
