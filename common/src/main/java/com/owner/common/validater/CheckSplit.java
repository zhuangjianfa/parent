package com.owner.common.validater;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * description:分隔符长度效验器
 * Author	Date	Changes
 * zhuangjianfa  2018年4月3日 Created
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckSplitValidator.class)
@Documented
public @interface CheckSplit {
    
    String message() default "以分隔符分隔的总数在{min}-{max}之间";  
    
    Class<?>[] groups() default {};  
  
    Class<? extends Payload>[] payload() default {};  
  
    int min() default 0;
    
    int max() default Integer.MAX_VALUE;
    
    String split();
}
