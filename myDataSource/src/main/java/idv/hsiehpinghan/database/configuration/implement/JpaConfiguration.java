package idv.hsiehpinghan.database.configuration.implement;

// Start of user code for import section
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import javax.annotation.Resource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
// End of user code

/**
 */
@Configuration("idv.hsiehpinghan.database.configuration.implement.JpaConfiguration")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {
	"idv.hsiehpinghan.database.repository"
})
@ComponentScan(basePackages = {
	"idv.hsiehpinghan.database.configuration.implement"
})
@Import({
	MssqlDataSourceConfigurationImplement.class
})
public class JpaConfiguration {
	/**
	 *
	 * @generated NOT
	 */
	@Resource(name="idv.hsiehpinghan.database.configuration.implement.MssqlDataSourceConfigurationImplement")
	private DataSourceConfiguration dataSourceConfiguration;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/

}
