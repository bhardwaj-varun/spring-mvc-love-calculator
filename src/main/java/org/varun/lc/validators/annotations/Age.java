package org.varun.lc.validators.annotations;

import org.varun.lc.validators.AgeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
    int lower() default 18;
    int upper() default 65;
    String message() default "{validators.annotations.Age.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
