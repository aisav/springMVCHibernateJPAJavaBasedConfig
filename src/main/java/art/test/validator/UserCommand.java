package art.test.validator;

import art.test.domain.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by art on 30.01.2017.
 */
public class UserCommand implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.user.username.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.user.password.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "error.user.confirmPassword.required");

//        Custom validations
        if(user.getUsername().length()<4){
            errors.rejectValue("username", "error.user.username.length");
        }

        if(!user.getPassword().equals(user.getConfirmPassword())) {
            errors.rejectValue("confirmPassword", "error.user.confirmPassword.same");

        }

    }
}
