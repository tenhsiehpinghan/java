package idv.hsiehpinghan.database.service;

import idv.hsiehpinghan.database.model.User;

/**
 */
public interface UserService{

	/**
	 */
	User findOne(String id);
	/**
	 */
	void deleteAll();
	/**
	 */
	boolean exists(String id);
	/**
	 */
	<UserExtends extends User> UserExtends save(UserExtends entity);

}
