package idv.hsiehpinghan.database.service;

import idv.hsiehpinghan.database.model.Student;

/**
 */
public interface UserService{

	/**
	 */
	Student findOne(String id);
	/**
	 */
	boolean exists(String id);
	/**
	 */
	void deleteAll();
	/**
	 */
	<StudentExtend extends Student> StudentExtend save(StudentExtend entity);

}
