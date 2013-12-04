package idv.hsiehpinghan.database.configuration.implement;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;

import org.apache.commons.dbutils.DbUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
// Start of user code for import section
import org.testng.annotations.Test;
// End of user code

public class DataSourceConfigurationImplement_Test implements DataSourceConfigurationImplement_TestInterface {
	/**
	 * @generated NOT
	 */
	private DataSourceConfigurationImplement dataSourceConfigurationImplement = new DataSourceConfigurationImplement();

//	/**
//	 * @generated NOT
//	 */
//	@DataProvider
//	public Object[][] dataProvider() {
//		return null;
//	}

//	/**
//	 * @generated NOT
//	 */
//	@BeforeSuite
//	public void beforeSuite() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@BeforeTest
//	public void beforeTest() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@BeforeClass
//	public void beforeClass() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@BeforeMethod
//	public void beforeMethod() {
//	}

	/**
	 *
	 * @generated NOT
	 */
	@Test
	@Override
	public void setEnvironment_Environment() {
		// TODO : need be to implemented
	}

	/**
   *
   * @generated NOT
   */
  @Test
  @Override
  public void Operation1() {
    // TODO : need be to implemented
  }

  /***********************
	 * Implemented methods *
	 **********************/
	/**
	 * 取得dataSource的operation。
	 *
	 * @generated NOT
	 */
	@Test
	@Override
	public void dataSource() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataSourceConfigurationImplement.class);
       
		DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			// 測試是否能正常連線。
			Assert.assertFalse(connection.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtils.closeQuietly(connection);
		}
		applicationContext.close();
	}


//	/**
//	 * @generated NOT
//	 */
//	@AfterMethod
//	public void afterMethod() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@AfterClass
//	public void afterClass() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@AfterTest
//	public void afterTest() {
//	}

//	/**
//	 * @generated NOT
//	 */
//	@AfterSuite
//	public void afterSuite() {
//	}

}
