package com.feyl.spring.core.convert.converter;

/**
 * A converter converts a source object of type {@code S} to a target of type {@code T}.
 *
 * 类型转换处理接口
 *
 * @author Feyl
 */
public interface Converter<S, T>  {

    /**
     * 将类型 {@code S} 的源对象转换为目标类型 {@code T}。
     */
    T convert(S source);
}
