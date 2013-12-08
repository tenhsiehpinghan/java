package idv.hsiehpinghan.database.service.implement;

// Start of user code for import section
import idv.hsiehpinghan.database.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import idv.hsiehpinghan.database.repository.UserRepository;
import org.springframework.stereotype.Service;
import idv.hsiehpinghan.database.model.User;
import javax.annotation.Resource;
import org.springframework.transaction.annotation.Propagation;
// End of user code

/**
 */
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
@Service("idv.hsiehpinghan.database.service.implement.UserServiceImpl")
public class UserServiceImpl implements UserService {
	/**
	 *
	 * @generated NOT
	 */
//	@Resource(name="idv.hsiehpinghan.database.repository.implement.userRepositoryImplement")
	@Resource
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
	public User findOne(String id) {
		return userRepository.findOne(id);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	@Transactional
	public <UserExtends extends User> UserExtends save(UserExtends entity) {
		return userRepository.save(entity);
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
