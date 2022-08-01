package com.feyl.spring.bean.factory.support;

import com.feyl.spring.bean.BeanException;
import com.feyl.spring.bean.factory.BeanFactory;
import com.feyl.spring.bean.factory.config.BeanDefinition;

/**
 * BeanDefinition 注册表接口
 *
 * @author Feyl
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeanException {
        Object bean = getSingleton(name);
        if (bean != null){
            return bean;
        }
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeanException;

}
