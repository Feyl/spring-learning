package com.feyl.spring.context.annotation;

import java.lang.annotation.*;

/**
 * @author Feyl
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Scope {

    String value() default "singleton";
}
