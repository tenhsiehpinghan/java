package idv.hsiehpinghan.database.configuration.implement;

import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
//import com.example.config.DataSourceConfiguration;
//import com.example.config.LocalDataSourceConfiguration;
//import com.example.model.Customer;
 





import javax.annotation.Resource;
//import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
 
 
@Configuration
@Import( { DataSourceConfigurationImplement.class })
@ComponentScan(basePackages={"idv.hsiehpinghan.database.service.implement"})
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"idv.hsiehpinghan.database.repository"})
public class JpaConfiguration {
    private DataSourceConfiguration dataSourceConfiguration;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws Exception {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSourceConfiguration.dataSource());
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
        localContainerEntityManagerFactoryBean.setPackagesToScan("idv.hsiehpinghan.database.model");
 

//        jpaVendorAdapter.setGenerateDdl(true);
 

        return localContainerEntityManagerFactoryBean;
    }
 
    @Bean
    public JpaTransactionManager transactionManager() throws Exception {
        EntityManagerFactory entityManagerFactory = entityManagerFactory().getObject();
        return new JpaTransactionManager(entityManagerFactory);
    } 
    
    @Resource(name = "idv.hsiehpinghan.database.configuration.implement.DataSourceConfigurationImplement")
    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
    	this.dataSourceConfiguration = dataSourceConfiguration;
    }
}
