package com.feyl.spring.test.bean;

import com.feyl.spring.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Feyl
 */
public class SpouseAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("关怀小两口(切面)：" + method);
    }
}
