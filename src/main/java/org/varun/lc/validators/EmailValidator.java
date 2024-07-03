package org.varun.lc.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.varun.lc.dto.CommunicationDto;
import org.varun.lc.dto.UserRegistrationDTO;

public class EmailValidator implements Validator {

    // checks if the validator object  matches the dto
    @Override
    public boolean supports(Class<?> clazz) {
        return UserRegistrationDTO.class.equals(clazz);
    }

    //runs only if supports return true
    @Override
    public void validate(Object object, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDto.email", "communicationDto.email.required", "Email can not be empty");

        UserRegistrationDTO userRegistrationDTO = (UserRegistrationDTO) object;
        CommunicationDto communicationDto = userRegistrationDTO.getCommunicationDto();
        String email = communicationDto.getEmail();
        if(!email.endsWith("@seleniumexpress.com")){
            errors.rejectValue("communicationDto.email", "communicationDto.email", "Email must end with @seleniumexpress.com");
        }

    }
}
