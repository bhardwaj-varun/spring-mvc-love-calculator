package org.varun.lc.validators.annotations;

import org.varun.lc.validators.PhoneValidatorImpl;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = PhoneValidatorImpl.class)
public @interface PhoneValidator {
    int length() default 10;
    String message() default "{validators.annotations.PhoneValidator.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
