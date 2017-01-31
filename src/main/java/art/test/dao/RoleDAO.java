package art.test.dao;

import art.test.domain.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by art on 31.01.2017.
 */
public interface RoleDAO extends CrudRepository<Role, Long> {

    public Role findRoleById(int id);

}
