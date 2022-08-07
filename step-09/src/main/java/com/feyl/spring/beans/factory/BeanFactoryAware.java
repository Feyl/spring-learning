package com.feyl.spring.beans.factory;

import com.feyl.spring.beans.BeansException;

/**
 * Interface to be implemented by beans that wish to be aware of their
 * owning {@link BeanFactory}.
 *
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @author Feyl
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
