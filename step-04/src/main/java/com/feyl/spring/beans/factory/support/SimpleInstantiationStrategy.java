package com.feyl.spring.beans.factory.support;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Feyl
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor constructor, Object[] args) throws BeansException {
        Class clazz = beanDefinition.getBeanClass();
            try {
                if (constructor != null) {
                    return clazz.getDeclaredConstructor(constructor.getParameterTypes()).newInstance(args);
                } else {
                    return clazz.getDeclaredConstructor().newInstance();
                }
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new BeansException("Failed to instantiate [" + clazz.getName() + "]", e);
            }
    }

}
