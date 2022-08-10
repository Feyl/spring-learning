package com.feyl.spring.context.support;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.factory.config.BeanPostProcessor;
import com.feyl.spring.context.ApplicationContext;
import com.feyl.spring.context.ApplicationContextAware;

/**
 * @author Feyl
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
