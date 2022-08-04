package com.feyl.spring.beans.factory.support;

import com.feyl.spring.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注冊接口
 *
 * @author Feyl
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
