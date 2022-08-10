package com.feyl.spring.aop;

import org.aopalliance.aop.Advice;

/**
 * Base interface holding AOP advice (action to take at a joinpoint)
 * and a filter determining the applicability of the advice (such as
 * a pointcut). This interface is not for use by Spring users, but to
 * allow for commonality in support for different types of advice.
 *
 * @author Feyl
 */
public interface Advisor {

    /**
     * Return the advice part of this aspect. An advice may be an
     * interceptor, a before advice, a throws advice, etc.
     * @return 如果切入点匹配，应该应用的通知
     * @see org.aopalliance.intercept.MethodInterceptor
     * @see BeforeAdvice
     */
    Advice getAdvice();
}
