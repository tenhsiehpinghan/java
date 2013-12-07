package idv.hsiehpinghan.database.service;

import idv.hsiehpinghan.database.model.User;
import idv.hsiehpinghan.database.repository.UserRepository;

/**
 */
public interface UserService{

	/**
	 */
	<UserExtends extends User, UserRepositoryExtends extends UserRepository> UserExtends save(UserExtends entity);

}
