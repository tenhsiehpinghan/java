package idv.hsiehpinghan.database.service.implement;

import idv.hsiehpinghan.database.model.User;
import idv.hsiehpinghan.database.repository.UserRepository;
import idv.hsiehpinghan.database.service.UserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("aa")
@Transactional
public class UserServiceImpl implements UserService {
	@Resource
	private UserRepository userRepository;

	@Override
	public <S extends User> S save(S entity) {
		return userRepository.save(entity);
	}

	@Override
	public void deleteAll() {
		userRepository.deleteAll();
	}

	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	@Override
	public boolean exists(String id) {
		return userRepository.exists(id);
	}

	@Override
	public User findOne(String id) {
		return userRepository.findOne(id);
	}

}