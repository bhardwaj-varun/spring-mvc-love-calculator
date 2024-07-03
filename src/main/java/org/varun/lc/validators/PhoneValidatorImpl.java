package org.varun.lc.validators;

import org.varun.lc.dto.Phone;
import org.varun.lc.validators.annotations.PhoneValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneValidatorImpl implements ConstraintValidator<PhoneValidator, Phone> {

    private int length;

    @Override
    public void initialize(PhoneValidator phoneAnnotation) {
        length=phoneAnnotation.length();
    }

    @Override
    public boolean isValid(Phone phone, ConstraintValidatorContext constraintValidatorContext) {
        if (phone == null) {
            return false;
        }
        return phone.getNumber().length()==length;
    }
}
