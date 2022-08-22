package com.feyl.spring.beans.factory.support;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.core.io.Resource;
import com.feyl.spring.core.io.ResourceLoader;

/**
 * @author Feyl
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;
}
