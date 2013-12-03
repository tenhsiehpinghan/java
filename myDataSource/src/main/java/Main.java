import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import idv.hsiehpinghan.database.configuration.implement.DataSourceConfigurationImplement;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.getEnvironment().setActiveProfiles("default");
        System.out.println(DataSourceConfiguration.class.getPackage().getName());
        applicationContext.scan(DataSourceConfiguration.class.getPackage().getName());
        applicationContext.refresh();
         
        DataSource newDataSource =applicationContext.getBean(DataSource.class);
        
        System.out.println("DataSource isClosed: " + newDataSource.getConnection().isClosed());
        newDataSource.getConnection().close();
    }
}