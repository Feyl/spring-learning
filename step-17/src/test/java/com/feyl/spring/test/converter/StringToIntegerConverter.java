package com.feyl.spring.test.converter;

import com.feyl.spring.core.convert.converter.Converter;

/**
 * @author Feyl
 */
public class StringToIntegerConverter implements Converter<String, Integer> {

    @Override
    public Integer convert(String source) {
        return Integer.valueOf(source);
    }
}
