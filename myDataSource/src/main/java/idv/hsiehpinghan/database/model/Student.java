package idv.hsiehpinghan.database.model;

import javax.persistence.Embedded;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;

/**
 */
@Entity(name = "[Student]")
public class Student implements Serializable {
	/**
	 */
	@Embedded
	public Address mAddress;
	/**
	 */
	@Id
	private Long mId;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/

	/*****************************
	 * Auto generated operations *
	 *****************************/
	public Address getMAddress() {
		return mAddress;
	}

	public void setMAddress(Address mAddress) {
		this.mAddress = mAddress;
	}

	public Long getMId() {
		return mId;
	}

	public void setMId(Long mId) {
		this.mId = mId;
	}


}
