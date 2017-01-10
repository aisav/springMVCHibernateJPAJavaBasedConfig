package art.test.service;

import art.test.domain.User;

/**
 * Created by art on 29.12.2016.
 */
public interface UserService {
    User findUserById(Long id);
    User findByUsername(String username);
}
