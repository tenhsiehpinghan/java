package idv.hsiehpinghan.database.service.implement;

// Start of user code for import section
import idv.hsiehpinghan.database.service.UserService;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import idv.hsiehpinghan.database.repository.UserRepository;
import idv.hsiehpinghan.database.model.User;
import org.springframework.transaction.annotation.Propagation;
// End of user code

/**
 */
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
public class UserServiceImpl implements UserService  {
	/**
	 *
	 * @generated NOT
	 */
	@Resource(name="idv.hsiehpinghan.database.configuration.implement.MssqlDataSourceConfigurationImplement")
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
		// TODO : need be to implemented
		return false;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	@Transactional
	public void deleteAll() {
		// TODO : need be to implemented
		
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public User findOne(String id) {
		// TODO : need be to implemented
		return null;
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	@Transactional
	public <UserExtends extends User> UserExtends save(UserExtends entity) {
		// TODO : need be to implemented
		return null;
	}
	

}
