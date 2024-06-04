package TASK1.DB_demo.Repository;

import TASK1.DB_demo.Model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByName(String name);
    User findById(int id);
}
