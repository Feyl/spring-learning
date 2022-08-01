package com.feyl.spring.bean.factory;

import com.feyl.spring.bean.BeanException;

/**
 * @author Feyl
 */
public interface BeanFactory {

    Object getBean(String name) throws BeanException;
}
