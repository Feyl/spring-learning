package com.feyl.spring.beans.factory;

import com.feyl.spring.beans.BeansException;

/**
 * @author Feyl
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;
}
