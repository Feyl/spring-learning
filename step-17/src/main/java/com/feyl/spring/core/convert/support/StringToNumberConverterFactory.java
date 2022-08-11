package com.feyl.spring.core.convert.support;

import com.feyl.spring.core.convert.converter.Converter;
import com.feyl.spring.core.convert.converter.ConverterFactory;
import com.feyl.spring.util.NumberUtil;
import com.sun.istack.internal.Nullable;

/**
 * Converts from a String any JDK-standard Number implementation.
 *
 * @author Feyl
 */
public class StringToNumberConverterFactory implements ConverterFactory<String, Number> {

    @Override
    public <T extends Number> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToNumber<>(targetType);
    }

    private static final class StringToNumber<T extends Number> implements Converter<String, T> {

        private final Class<T> targetType;

        public StringToNumber(Class<T> targetType) {
            this.targetType = targetType;
        }

        @Override
        @Nullable
        public T convert(String source) {
            if (source.isEmpty()) {
                return null;
            }
            return NumberUtil.parseNumber(source, this.targetType);
        }
    }
}
