package com.feyl.spring.test.common;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.PropertyValue;
import com.feyl.spring.beans.PropertyValues;
import com.feyl.spring.beans.factory.ConfigurableListableBeanFactory;
import com.feyl.spring.beans.factory.config.BeanDefinition;
import com.feyl.spring.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author Feyl
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = ((BeanDefinition) beanDefinition).getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
