package com.feyl.spring.test.bean;

import com.feyl.spring.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Feyl
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}