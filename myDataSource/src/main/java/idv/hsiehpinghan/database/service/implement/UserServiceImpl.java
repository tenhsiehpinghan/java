package idv.hsiehpinghan.database.service.implement;

// Start of user code for import section
import idv.hsiehpinghan.database.repository.UserRepository;

import org.springframework.transaction.annotation.Propagation;

import idv.hsiehpinghan.database.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idv.hsiehpinghan.database.service.UserService;

import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
// End of user code

/**
 */
@Service("idv.hsiehpinghan.database.service.implement.UserServiceImpl")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class UserServiceImpl implements UserService {
	/**
	 */
//	@Resource(name="idv.hsiehpinghan.database.repository.implement.userRepositoryImplement")
	@Autowired
	private UserRepository userRepository;

	/**************
	 * operations *
	 **************/

	/**************************
	 * Implemented operations *
	 **************************/
	/**
	 * @generated NOT
	 */
	@Override
	public boolean exists(String id) {
		return userRepository.exists(id);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	@Transactional
	public <StudentExtend extends Student> StudentExtend save(StudentExtend entity) {
		return userRepository.save(entity);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public Student findOne(String id) {
		return userRepository.findOne(id);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	@Transactional
	public void deleteAll() {
		userRepository.deleteAll();
	}
	

	/*****************************
	 * Auto generated operations *
	 *****************************/

}
