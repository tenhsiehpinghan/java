package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import java.beans.PropertyVetoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 */
@Configuration("idv.hsiehpinghan.database.configuration.implement.MssqlDataSourceConfigurationImplement")
@PropertySource({"mssqlDataSourceConfigurationImplement.properties"})
public class MssqlDataSourceConfigurationImplement implements DataSourceConfiguration {
	/**
	 * 用來取得properties參數的類別。
	 *
	 * @generated NOT
	 */
	@Autowired
	private Environment environment;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/
	/**
	 * @throws PropertyVetoException 
	 * @generated NOT
	 */
	@Override
	public DataSource dataSource() {
		String driverClass = environment.getProperty("mssql.driverClass");
		String jdbcUrl = environment.getProperty("mssql.jdbcUrl");
		String user = environment.getProperty("mssql.user");
		String password = environment.getProperty("mssql.password");
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		try {
			comboPooledDataSource.setDriverClass(driverClass);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboPooledDataSource.setJdbcUrl(jdbcUrl);
		comboPooledDataSource.setUser(user);
		comboPooledDataSource.setPassword(password);
		return comboPooledDataSource;
	}
	

	/*****************************
	 * Auto generated operations *
	 *****************************/

}
