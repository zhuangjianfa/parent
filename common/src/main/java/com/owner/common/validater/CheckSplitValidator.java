package com.owner.common.validater;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

/**
 * description:分隔符校验器
 * Author	Date	Changes
 * zhuangjianfa  2018年4月3日 Created
 */
public class CheckSplitValidator implements ConstraintValidator<CheckSplit, String> {

    private int    min;

    private int    max;

    private String split;

    public void initialize(CheckSplit checkSplit) {  
        min = checkSplit.min();
        max = checkSplit.max();
        split = checkSplit.split();
     }  
    /*
     * (non-Javadoc)
     * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
     * javax.validation.ConstraintValidatorContext)
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean isValid = true;
        if (StringUtils.isBlank(value)) {
            isValid = false;
        } else if (value.split(split).length < min || value.split(split).length > max) {
            isValid = false;
        }
        return isValid;
    }
}
