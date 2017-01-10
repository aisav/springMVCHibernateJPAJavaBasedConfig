package art.test.dao;

import art.test.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by art on 29.12.2016.
 */
public interface UserDAO extends CrudRepository<User, Long> {

//  Customized methods
    public User findUserByUsername(String username);
}
