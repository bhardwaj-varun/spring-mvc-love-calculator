package org.varun.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.varun.lc.dto.UserRegistrationDTO;

public class UserNameValidator implements Validator {

    //check if the object matches the dto object
    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegistrationDTO.class.equals(clazz);
    }

    //only called if supports() return true
    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.required", "userName cannot be empty");
        String userName = ((UserRegistrationDTO) object).getUserName();
        if(!userName.contains("_")){
            errors.rejectValue("userName", "userName.invalid", "Username must contain '_'");
        }
    }
}
