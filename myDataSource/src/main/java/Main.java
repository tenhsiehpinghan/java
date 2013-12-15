import idv.hsiehpinghan.database.configuration.DataSourceConfiguration;
import idv.hsiehpinghan.database.configuration.implement.JpaConfiguration;
import idv.hsiehpinghan.database.model.Address;
import idv.hsiehpinghan.database.model.Student;
import idv.hsiehpinghan.database.service.UserService;

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
        Student student = new Student();
        student.setMId(3333L);
        Address mAddress = new Address();
        mAddress.setNumber("number_1");
        mAddress.setStreet("street_1");
        student.setMAddress(mAddress);
        userService.save(student);
        applicationContext.close();
    }
}