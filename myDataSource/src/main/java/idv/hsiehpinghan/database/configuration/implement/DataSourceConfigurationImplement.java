package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import javax.sql.DataSource;
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 *
 * @generated NOT
 */
@Configuration
public class DataSourceConfigurationImplement implements DataSourceConfiguration  {


	/***********************
	 * Implemented methods *
	 **********************/
	@Override
	@Bean
	public DataSource dataSource() {
		// TODO : need be to implemented
		return null;
	}
	

}
