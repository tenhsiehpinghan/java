package com.apress.prospring3.ch0.annotation;

// Start of user code for import section
import com.apress.prospring3.ch0.MessageRenderer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.apress.prospring3.ch0.MessageProvider;
// End of user code

/**
 *
 * @generated NOT
 */
@Service("com.apress.prospring3.ch0.annotation.StandardOutMessageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer  {
	/**
	 */
	private MessageProvider messageProvider;


	/***********************
	 * Implemented methods *
	 **********************/
	@Override
	public MessageProvider getMessageProvider() {
		return messageProvider;
	}
	
	@Override
	public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());	
	}
	
	@Override
	@Resource(name="com.apress.prospring3.ch0.annotation.HelloWorldMessageProvider")
	public void setMessageProvider(MessageProvider provider) {
		messageProvider = provider;
	}
	

}
