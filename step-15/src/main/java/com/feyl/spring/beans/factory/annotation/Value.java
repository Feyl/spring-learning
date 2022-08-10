package com.feyl.spring.beans.factory.annotation;

import java.lang.annotation.*;

/**
 * Annotation at the field or method/constructor parameter level
 * that indicates a default value expression for the affected argument.
 *
 * @author Feyl
 */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Value {

    /**
     * 实际值表达式：e.g. “#{systemProperties.myProp}”。
     */
    String value();
}
