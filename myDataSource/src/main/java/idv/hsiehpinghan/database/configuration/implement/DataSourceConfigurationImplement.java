package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import org.springframework.core.env.Environment;
import javax.sql.DataSource;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 */
public class DataSourceConfigurationImplement implements DataSourceConfiguration  {
	/**
	 * 用來取得properties參數的類別。
	 *
	 * @generated NOT
	 */
	private Environment environment;

	/**************
	 * operations *
	 **************/
	/**
	 *
	 * @generated NOT
	 */
	public void setEnvironment(Environment environment) {
		// TODO : need be to implemented
		
	}
	

	/**************************
	 * Implemented operations *
	 **************************/
	/**
	 * @generated NOT
	 */
	@Override
	public DataSource dataSource() {
		// TODO : need be to implemented
		return null;
	}
	

}
