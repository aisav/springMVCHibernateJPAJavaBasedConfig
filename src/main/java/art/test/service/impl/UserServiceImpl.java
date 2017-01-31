package art.test.service.impl;

import art.test.dao.RoleDAO;
import art.test.dao.UserDAO;
import art.test.domain.Role;
import art.test.domain.User;
import art.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * Created by art on 29.12.2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public User findUserById(Long id) {
        return userDAO.findOne(id);
    }

@Override
    public User findByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDAO.findAll();
        return users;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public void save(User user) {

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setr Roles(new HashSet<>(roleRepository.findAll()));
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(roleDAO.findRoleById(1));
        userDAO.save(user);
    }

    @Override
    public User edit(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
