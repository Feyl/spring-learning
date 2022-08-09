package com.feyl.spring.aop;

/**
 * Filter that restricts matching of a pointcut
 * or introduction to a given set of target classes.
 *
 * @author Feyl
 */
public interface ClassFilter {

    /**
     * 切入点是否应该应用于给定的接口或目标类？
     * @param clazz 候选目标类
     * @return 通知是否应适用于给定的目标类
     */
    boolean matches(Class<?> clazz);
}
