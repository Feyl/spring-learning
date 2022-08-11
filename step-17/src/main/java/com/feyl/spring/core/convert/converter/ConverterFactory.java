package com.feyl.spring.core.convert.converter;

/**
 * A factory for "ranged" converters that can convert objects from S to subtypes of R.
 *
 * 类型转换工厂
 *
 * @author Feyl
 */
public interface ConverterFactory<S, R>{

    /**
     * 让转换器从 S 转换为目标类型 T，其中 T 也是 R 的一个实例。
     * @param <T> 目标类型
     * @param targetType 要转换为的目标类型
     * @return 从 S 到 T 的转换器
     */
    <T extends R> Converter<S, T> getConverter(Class<T> targetType);
}
