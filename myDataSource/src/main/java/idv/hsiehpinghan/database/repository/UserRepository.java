package idv.hsiehpinghan.database.repository;

import org.springframework.data.repository.CrudRepository;
import idv.hsiehpinghan.database.model.User;

/**
 */
public interface UserRepository extends CrudRepository<User, String> {


}
