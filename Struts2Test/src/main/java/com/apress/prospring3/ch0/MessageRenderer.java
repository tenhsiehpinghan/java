package com.apress.prospring3.ch0;



/**
 */
public interface MessageRenderer{

	/**
	 */
	void setMessageProvider(MessageProvider provider);
	/**
	 */
	void render();
	/**
	 */
	MessageProvider getMessageProvider();

}
