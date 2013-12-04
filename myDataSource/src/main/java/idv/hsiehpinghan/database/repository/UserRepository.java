package idv.hsiehpinghan.database.repository;

import idv.hsiehpinghan.database.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface UserRepository extends CrudRepository<User, String> {
}
