package com.feyl.spring.core.convert.converter;

/**
 * For registering converters with a type conversion system.
 *
 * 类型转换注册接口
 *
 * @author Feyl
 */
public interface ConverterRegistry {

    /**
     * 向此注册表添加一个普通转换器。
     * 可转换的源/目标类型对派生自转换器的参数化类型。
     * @throws IllegalArgumentException 如果无法解析参数化类型
     */
    void addConverter(Converter<?, ?> converter);

    /**
     * 将通用转换器添加到此注册表。
     */
    void addConverter(GenericConverter converter);

    /**
     * 将 ranged 转换器工厂添加到此注册表。
     * 可转换的源/目标类型对派生自 ConverterFactory 的参数化类型。
     * @throws IllegalArgumentException 如果无法解析参数化类型
     */
    void addConverterFactory(ConverterFactory<?, ?> converterFactory);
}
