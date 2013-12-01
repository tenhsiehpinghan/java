package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import javax.inject.Inject;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 *
 * @generated NOT
 */
@Configuration
@PropertySource({
})
public class DataSourceConfigurationImplement implements DataSourceConfiguration  {
	/**
	 * 用來取得properties參數的類別。
	 */
	private Environment environment;

	/**
	 */
	@Inject
	public void setEnvironment(Environment environment) {
		// TODO : need be to implemented
		
	}
	

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
