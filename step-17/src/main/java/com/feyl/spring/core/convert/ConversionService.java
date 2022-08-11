package com.feyl.spring.core.convert;

import com.sun.istack.internal.Nullable;

/**
 * A service interface for type conversion. This is the entry point into the convert system.
 * Call {@link #convert(Object, Class)} to perform a thread-safe type conversion using this system.
 *
 * 类型转换抽象接口
 *
 * @author Feyl
 */
public interface ConversionService {

    /**
     * 如果 {@code sourceType} 的对象可以转换为 {@code targetType}，则返回 {@code true}。
     */
    boolean canConvert(@Nullable Class<?> sourceType, Class<?> targetType);

    /**
     * 将给定的 {@code source} 转换为指定的 {@code targetType}。
     */
    <T> T convert(Object source, Class<T> targetType);
}
