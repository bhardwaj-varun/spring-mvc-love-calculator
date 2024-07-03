package org.varun.lc.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.varun.lc.dto.CommunicationDto;
import org.varun.lc.dto.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {
    //check if the object matches the dto object
    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegistrationDTO.class.equals(clazz);
    }

    //only called if supports() return true
    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDto.email", "communicationDto.email.required", "Email cannot be empty");
        UserRegistrationDTO userRegistrationDTO = (UserRegistrationDTO) object;
        CommunicationDto communicationDto = userRegistrationDTO.getCommunicationDto();
        String email = communicationDto.getEmail();
        if (!email.endsWith("@seleniumexpress.com")) {
            errors.rejectValue("communicationDto.email", "communicationDto.email.invalid", "Email must end with '@seleniumexpress.com'");
        }
    }
}
