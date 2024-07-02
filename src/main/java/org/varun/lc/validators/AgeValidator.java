package org.varun.lc.validators;

import org.varun.lc.validators.annotations.Age;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {
    private int lower;
    private int upper;
    @Override
    public void initialize(Age ageAnnotation) {
        this.lower = ageAnnotation.lower();
        this.upper = ageAnnotation.upper();
    }

    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext constraintValidatorContext) {
        if(age ==null){
            return false;
        }
        return age >= this.lower && age <= this.upper;
    }
}
