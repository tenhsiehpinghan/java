package com.apress.prospring3.ch0.annotation;

// Start of user code for import section
import com.apress.prospring3.ch0.MessageProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
// End of user code

/**
 *
 * @generated NOT
 */
@Service("com.apress.prospring3.ch0.annotation.HelloWorldMessageProvider")
public class HelloWorldMessageProvider implements MessageProvider  {
	/**
	 */
	private String message;


	/***********************
	 * Implemented methods *
	 **********************/
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	@Value("${jdbc.driverClassName}")
	public void setMessage(String message) {
		this.message = message;
	}
	

}
