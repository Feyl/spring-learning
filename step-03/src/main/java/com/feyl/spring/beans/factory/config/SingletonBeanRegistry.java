package com.feyl.spring.beans.factory.config;

/**
 * 单例注册表
 *
 * @author Feyl
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
