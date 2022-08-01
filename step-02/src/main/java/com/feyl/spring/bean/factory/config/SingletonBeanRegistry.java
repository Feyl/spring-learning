package com.feyl.spring.bean.factory.config;

/**
 * 单例注册表
 *
 * @author Feyl
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
