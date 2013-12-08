package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import java.beans.PropertyVetoException;

import org.springframework.context.annotation.Import;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// End of user code

/**
 */
@Import({
	MssqlDataSourceConfigurationImplement.class
})
@Configuration("idv.hsiehpinghan.database.configuration.implement.JpaConfiguration")
@EnableTransactionManagement
@ComponentScan(basePackages = {
	"idv.hsiehpinghan"
})
@EnableJpaRepositories(basePackages = {
	"idv.hsiehpinghan.database.repository"
})
public class JpaConfiguration{
	/**
	 *
	 * @generated NOT
	 */
	@Resource(name="idv.hsiehpinghan.database.configuration.implement.MssqlDataSourceConfigurationImplement")
	private DataSourceConfiguration dataSourceConfiguration;

	/**************
	 * operations *
	 **************/
	/**
	 *
	 * @throws PropertyVetoException 
	 * @generated NOT
	 */
	@Bean
	public JpaTransactionManager transactionManager() throws PropertyVetoException {
        EntityManagerFactory entityManagerFactory = entityManagerFactory().getObject();
        return new JpaTransactionManager(entityManagerFactory);
	}
	
	/**
	 *
	 * @throws PropertyVetoException 
	 * @generated NOT
	 */
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSourceConfiguration.dataSource());
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setGenerateDdl(true);
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setPackagesToScan("idv.hsiehpinghan.database.model");
        return localContainerEntityManagerFactoryBean;
	}
	

	/**************************
	 * Implemented operations *
	 **************************/

	/*****************************
	 * Auto generated operations *
	 *****************************/

}
