package idv.hsiehpinghan.database.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 */
@Embeddable
public class Address implements Serializable {
	/**
	 */
	private String street;
	/**
	 */
	private String number;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/

	/*****************************
	 * Auto generated operations *
	 *****************************/
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}


}
