package com.feyl.spring.aop;

import java.lang.reflect.Method;

/**
 * Part of a {@link Pointcut}: Checks whether the target method is eligible for advice.
 *
 * @author Feyl
 */
public interface MethodMatcher {

    /**
     * 执行静态检查给定方法是否匹配。
     * @return 此方法是否静态匹配
     */
    boolean matches(Method method, Class<?> targetClass);
}
