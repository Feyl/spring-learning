package com.feyl.spring.aop;

/**
 * Core Spring pointcut abstraction.
 *
 * A pointcut is composed of a {@link ClassFilter} and a {@link MethodMatcher}.
 * Both these basic terms and a Pointcut itself can be combined to build up combinations
 *
 * @author Feyl
 */
public interface Pointcut {

    /**
     * 返回此切入点的 ClassFilter。
     *
     * @return the ClassFilter (never <code>null</code>)
     */
    ClassFilter getClassFilter();

    /**
     * 返回此切入点的 MethodMatcher。
     *
     * @return the MethodMatcher (never <code>null</code>)
     */
    MethodMatcher getMethodMatcher();
}
