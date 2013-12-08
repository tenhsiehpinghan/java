package idv.hsiehpinghan.database.model;

// Start of user code for import section
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
// End of user code

/**
 */
@Entity(name = "[User]")
public class User implements Serializable {
	/**
	 *
	 */
	private String password;
	/**
	 *
	 */
	@Id
	private String personalId;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/

	/*****************************
	 * Auto generated operations *
	 *****************************/
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}


}
