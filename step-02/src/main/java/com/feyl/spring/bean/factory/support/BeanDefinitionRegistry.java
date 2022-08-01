package com.feyl.spring.bean.factory.support;

import com.feyl.spring.bean.factory.config.BeanDefinition;

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
