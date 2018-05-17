package com.owner.common.utils;

import java.util.Set;

import javax.validation.*;

/**
 * @Description:效验工具类
 * Author	Version		Date		Changes
 * zhuangjianfa 1.0  2018年2月1日 Created
 */
public class CheckParamUtil
{
    private static Validator validator;
    
    public static <T> String checkParam(final T obj, final Class<?>... group) {
        final Set<ConstraintViolation<T>> constraintViolations = CheckParamUtil.validator.validate(obj, (Class[])group);
        final StringBuilder strBuilder = new StringBuilder();
        if (constraintViolations != null && constraintViolations.size() > 0) {
            for (final ConstraintViolation<T> cv : constraintViolations) {
                strBuilder.append(cv.getPropertyPath()).append(":").append(cv.getMessage()).append(";");
            }
            return strBuilder.toString();
        }
        return null;
    }
    
    public static <T> String checkParam(final T obj, final Class<?> group, final String... args) {
        final StringBuilder strBuilder = new StringBuilder("");
        if (args != null) {
            for (final String param : args) {
                final Set<ConstraintViolation<T>> constraintViolations = CheckParamUtil.validator.validateProperty(obj, param, new Class[] {group});
                if (constraintViolations != null && constraintViolations.size() > 0) {
                    for (final ConstraintViolation<T> cv : constraintViolations) {
                        strBuilder.append(cv.getPropertyPath()).append(":").append(cv.getMessage()).append(";");
                    }
                }
            }
        }
        return strBuilder.toString().equals("") ? null : strBuilder.toString();
    }
    
    static {
        CheckParamUtil.validator = Validation.buildDefaultValidatorFactory().getValidator();
    }
}
