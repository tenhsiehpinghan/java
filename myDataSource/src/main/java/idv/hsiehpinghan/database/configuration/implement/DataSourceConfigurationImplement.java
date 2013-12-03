package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import java.beans.PropertyVetoException;

import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 */
@Configuration
@PropertySource({
	"test.properties"
})
public class DataSourceConfigurationImplement implements DataSourceConfiguration  {
	/**
	 * 用來取得properties參數的類別。
	 *
	 * @generated NOT
	 */
	private Environment environment;

	/**
	 *
	 * @generated NOT
	 */
	@Autowired
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
	

	/***********************
	 * Implemented methods *
	 ***********************/
	/**
	 * @generated NOT
	 */
	@Override
	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		String driverClass = environment.getProperty("myDriverClass");
		String jdbcUrl = environment.getProperty("myJdbcUrl");
		String user = environment.getProperty("myUser");
		String password = environment.getProperty("myPassword");
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setDriverClass(driverClass);
		comboPooledDataSource.setJdbcUrl(jdbcUrl);
		comboPooledDataSource.setUser(user);
		comboPooledDataSource.setPassword(password);
		return comboPooledDataSource;
	}
	

}
