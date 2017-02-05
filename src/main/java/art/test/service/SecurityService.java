package art.test.service;

/**
 * Created by art on 03.02.2017.
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
