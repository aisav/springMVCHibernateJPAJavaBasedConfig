package art.test.controller;

import art.test.domain.User;
import art.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by art on 29.01.2017.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/admin/{fromViewParam}", method = RequestMethod.GET)
    @Secured("ROLE_ADMIN")
    public ModelAndView toAdmin(
            @PathVariable("fromViewParam") String fromViewParam) {

        ModelAndView model = new ModelAndView();
        List<User> users = userService.findAll();
        model.addObject("users", users);
        model.addObject("message", fromViewParam);
        model.setViewName("admin/admin");
        return model;
    }

/*    @RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
    public ModelAndView newUser(ModelAndView model) {
        model.addObject("user", new User());
        model.setViewName("registration");
        return model;
    }*/

    @RequestMapping(value = "/user/registration", method = RequestMethod.GET)
    public ModelAndView showRegistrationForm( ModelAndView model) {
//        UserDto userDto = new UserDto();
//        model.addAttribute("user", new User());
        model.addObject("user", new User());
        model.setViewName("registration");
        return model;
    }


}
