package com.feyl.spring.bean.factory.support;

import com.feyl.spring.bean.BeanException;
import com.feyl.spring.bean.factory.BeanFactory;
import com.feyl.spring.bean.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Feyl
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeanException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeanException("No bean named '"+ beanName + "' is defined");
        }
        return beanDefinition;
    }

}
