import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//import com.apress.prospring3.ch0.MessageProvider;
//import com.apress.prospring3.ch0.MessageRenderer;


import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.apress.prospring3.ch0.MessageProvider;
import com.apress.prospring3.ch0.MessageRenderer;
import com.apress.prospring3.ch0.javaconfig.AppConfig;

public class Main {

	public static void main(String[] args) {

//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//		ctx.load("applicationcontext.xml");
		// ctx.load("classpath:app-context-annotation.xml");
		ApplicationContext ctx = new
				AnnotationConfigApplicationContext(AppConfig.class);
		
//		ctx.refresh();

		MessageRenderer messageRenderer = ctx.getBean("com.apress.prospring3.ch0.annotation.StandardOutMessageRenderer",
				MessageRenderer.class);
		
//		System.out.println(messageProvider.getMessage());
		messageRenderer.render();
		
//		ctx.close();
	}

}
