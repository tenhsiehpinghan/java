package idv.hsiehpinghan.database.service;

import idv.hsiehpinghan.database.model.User;

public interface UserService {
	<S extends User> S save(S entity);
	void deleteAll();
	boolean exists(String id);
	User findOne(String id);
}
