package com.feyl.spring.util;

import com.feyl.spring.beans.factory.config.ConfigurableBeanFactory;

/**
 * Simple strategy interface for resolving a String value.
 * Used by {@link ConfigurableBeanFactory}.
 *
 * @author Feyl
 */
public interface StringValueResolver {

    String resolveStringValue(String strVal);
}
