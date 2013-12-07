package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import javax.annotation.Resource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
// End of user code

/**
 */
@Import({
	DataSourceConfigurationImplement.class
})
@Configuration("idv.hsiehpinghan.database.configuration.implement.JpaConfiguration")
@ComponentScan(basePackages = {
	"idv.hsiehpinghan.database.configuration.implement"
})
@EnableJpaRepositories(basePackages = {
	"idv.hsiehpinghan.database.repository"
})
@EnableTransactionManagement
public class JpaConfiguration {
	/**
	 *
	 * @generated NOT
	 */
	private DataSourceConfiguration dataSourceConfiguration;

	/**************
	 * operations *
	 **************/
	/**
	 *
	 * @generated NOT
	 */
	@Resource(name="idv.hsiehpinghan.database.configuration.implement.DataSourceConfigurationImplement")
	public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
		// TODO : need be to implemented
		
	}
	

	/**************************
	 * Implemented operations *
	 **************************/

}
