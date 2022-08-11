package com.feyl.spring.beans.factory.config;

import com.feyl.spring.beans.factory.BeanFactory;
import com.feyl.spring.beans.factory.HierarchicalBeanFactory;
import com.feyl.spring.core.convert.ConversionService;
import com.feyl.spring.util.StringValueResolver;
import com.sun.istack.internal.Nullable;

/**
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link BeanFactory} interface.
 *
 * @author Feyl
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();


    /**
     * 为嵌入值（例如注释属性）添加字符串解析器。
     * @param valueResolver 应用于嵌入值的字符串解析器
     * @since 3.0
     */
    void addEmbeddedValueResolver(StringValueResolver valueResolver);

    /**
     * 解析给定的嵌入值，例如注释属性。
     * @param value 要解析的值
     * @return 解析后的值（可能是原始值）
     * @since 3.0
     */
    String resolveEmbeddedValue(String value);

    /**
     * 返回关联的 ConversionService（如果有）。
     * @since 3.0
     */
    @Nullable
    ConversionService getConversionService();

    /**
     * 指定一个 Spring 3.0 ConversionService 用于转换属性值，
     * 作为 JavaBeans PropertyEditors 的替代方法。
     * @since 3.0
     */
    void setConversionService(ConversionService conversionService);
}