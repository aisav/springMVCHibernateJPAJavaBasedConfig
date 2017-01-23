package art.test.service;

import art.test.domain.User;

import java.util.List;

/**
 * Created by art on 29.12.2016.
 */
public interface UserService {
    User findUserById(Long id);
    User findByUsername(String username);
    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);
}
