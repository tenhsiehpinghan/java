package idv.hsiehpinghan.database.service;

import idv.hsiehpinghan.database.model.User;

/**
 */
public interface UserService{

	/**
	 */
	boolean exists(String id);
	/**
	 */
	void deleteAll();
	/**
	 */
	User findOne(String id);
	/**
	 */
	<UserExtends extends User> UserExtends save(UserExtends entity);

}
