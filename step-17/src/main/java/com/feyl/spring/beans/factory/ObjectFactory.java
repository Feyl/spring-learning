package com.feyl.spring.beans.factory;

import com.feyl.spring.beans.BeansException;

/**
 * Defines a factory which can return an Object instance
 * (possibly shared or independent) when invoked.
 *
 * @author Feyl
 */
public interface ObjectFactory<T> {

    T getObject() throws BeansException;
}
