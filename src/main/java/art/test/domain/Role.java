package art.test.domain;

import javax.persistence.*;
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

    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="user_role",
            joinColumns = {@JoinColumn(name="role_id", referencedColumnName="id")},
            inverseJoinColumns = {@JoinColumn(name="user_id", referencedColumnName="id")}
    )
    private Set<User> userrole;

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

    public Set<User> getUserrole() {
        return userrole;
    }

    public void setUserrole(Set<User> userrole) {
        this.userrole = userrole;
    }

}
