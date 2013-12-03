package idv.hsiehpinghan.database.configuration;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

/**
 * Spring用的configuration interface，
 * 用來建立dataSource的資料庫連線。
 */
public interface DataSourceConfiguration{

	/**
	 * 取得dataSource的operation。
	 */
	DataSource dataSource() throws PropertyVetoException;

}
