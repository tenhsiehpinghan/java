package idv.hsiehpinghan.database.repository;

import idv.hsiehpinghan.database.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 */
public interface UserRepository extends CrudRepository<Student, String>{


}
