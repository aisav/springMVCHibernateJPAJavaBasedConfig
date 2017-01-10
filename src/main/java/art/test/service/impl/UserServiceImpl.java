package art.test.service.impl;

import art.test.dao.UserDAO;
import art.test.domain.User;
import art.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by art on 29.12.2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserById(Long id) {
        return userDAO.findOne(id);
    }

@Override
    public User findByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }
}
