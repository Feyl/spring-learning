package com.feyl.spring.beans.factory.config;

/**
 * @author Feyl
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
