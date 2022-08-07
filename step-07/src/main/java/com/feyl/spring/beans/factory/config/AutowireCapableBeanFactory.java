package com.feyl.spring.beans.factory.config;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.factory.BeanFactory;

/**
 * Extension of the {@link BeanFactory} interface to be implemented by
 * bean factories that are capable of autowiring, provided that they
 * want to expose this functionality for existing bean instances.
 *
 * @author Feyl
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;
}
