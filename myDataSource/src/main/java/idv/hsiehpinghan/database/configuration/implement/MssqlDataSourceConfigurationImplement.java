package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import org.springframework.beans.factory.annotation.Autowired;
import javax.sql.DataSource;
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import org.springframework.core.env.Environment;
// End of user code

/**
 * 實作DataSourceConfiguration interface的class。
 */
public class MssqlDataSourceConfigurationImplement implements DataSourceConfiguration  {
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
	 * @generated NOT
	 */
	@Override
	public DataSource dataSource() {
		// TODO : need be to implemented
		return null;
	}
	

}
