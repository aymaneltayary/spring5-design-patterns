/**
 * 
 */
package com.springDesignPattern.chapter9.config;



import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;








/**
 * @author aeltayary
 *
 */
@Configuration
@PropertySource("config.properties")
@ComponentScan(basePackages = {"com.springDesignPattern.chapter9.service",
								"com.springDesignPattern.chapter9.repo", 
								"com.springDesignPattern.chapter9.config"})
@EnableCaching
public class ApplicationConfig {


/**
 * ConcurrentMapCasheManager and SimpleCashManager
 * are simple caching manager
 * @return
 
	
@Bean
public CacheManager cachManager(){
	return new ConcurrentMapCacheManager();
	
}

*/



	
@Bean
public EhCacheManagerFactoryBean ehCacheManagerFactoryBean(){
	EhCacheManagerFactoryBean ehCacheFactory= new EhCacheManagerFactoryBean();
	ehCacheFactory.setConfigLocation(new ClassPathResource("ehcache.xml"));
	return ehCacheFactory;
}


@Bean
public CacheManager cacheManager(net.sf.ehcache.CacheManager cacheManager){
	EhCacheCacheManager ecm= new EhCacheCacheManager();
	ecm.setCacheManager(cacheManager);
	return ecm;
}


}
