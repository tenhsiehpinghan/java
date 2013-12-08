import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import idv.hsiehpinghan.database.configuration.implement.JpaConfiguration;
import idv.hsiehpinghan.database.model.User;
import idv.hsiehpinghan.database.service.UserService;
import idv.hsiehpinghan.database.service.implement.UserServiceImpl;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JpaConfiguration.class);
//        applicationContext.getEnvironment().setActiveProfiles("default");
//        System.out.println(DataSourceConfiguration.class.getPackage().getName());
//        applicationContext.scan(DataSourceConfiguration.class.getPackage().getName());
//        applicationContext.refresh();
         
        UserService userService =applicationContext.getBean("idv.hsiehpinghan.database.service.implement.UserServiceImpl", UserService.class);
        User user = new User();
        user.setPersonalId("personalId_1");
        user.setPassword("password");
        userService.save(user);
        applicationContext.close();
    }
}