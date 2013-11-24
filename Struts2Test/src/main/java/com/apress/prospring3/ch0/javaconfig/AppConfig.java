package com.apress.prospring3.ch0.javaconfig;

// Start of user code for import section
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
// End of user code

/**
 *
 * @generated NOT
 */
@Configuration
@ComponentScan(basePackages = {
	"com.apress.prospring3.ch0"
,	"com.apress"
})
public class AppConfig implements ApplicationContextAware  {
	/**
	 */
	private ApplicationContext ctx;

	/**
	 */
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		Resource[] resources = new Resource[1];
		Resource resource = ctx.getResource("classpath:jdbc.properties");
		resources[0] = resource;
		propertySourcesPlaceholderConfigurer.setLocations(resources);
		return propertySourcesPlaceholderConfigurer;
	}
	

	/***********************
	 * Implemented methods *
	 **********************/
	/**
	 * @generated NOT
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		ctx = applicationContext;
	}
	

}
