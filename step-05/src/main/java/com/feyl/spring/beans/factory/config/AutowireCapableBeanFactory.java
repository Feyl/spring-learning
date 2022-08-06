package com.feyl.spring.beans.factory.config;

import com.feyl.spring.beans.factory.BeanFactory;

/**
 * Extension of the {@link BeanFactory}
 * interface to be implemented by bean factories that are capable of
 * autowiring, provided that they want to expose this functionality for
 * existing bean instances.
 *
 * @author Feyl
 */
public interface AutowireCapableBeanFactory extends BeanFactory {

}
