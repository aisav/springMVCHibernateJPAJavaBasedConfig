package art.test.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by art on 30.01.2017.
 */
@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue
    private Integer id;

    private String role;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
