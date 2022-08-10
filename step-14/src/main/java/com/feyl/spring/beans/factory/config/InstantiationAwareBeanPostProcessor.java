package com.feyl.spring.beans.factory.config;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.PropertyValues;

/**
 * Sub-interface of {@link BeanPostProcessor} that adds a before-instantiation callback,
 * and a callback after instantiation but before explicit properties are set or autowiring occurs.
 *
 * @author Feyl
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {

    /**
     * 在目标 bean 被实例化之前应用这个 BeanPostProcessor。
     * 返回的 bean 对象可能是使用的代理，而不是目标 bean，有效地抑制了目标 bean 的默认实例化。
     *
     * 在 Bean 对象执行初始化方法之前，执行此方法
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;


    /**
     * 在工厂将给定的属性值应用于给定的 bean 之前对其进行后处理。
     * 允许检查是否所有依赖项都已满足，例如基于 bean 属性设置器上的“Required”注释。
     *
     * 在 Bean 对象实例化完成后，设置属性操作之前执行此方法
     *
     * @param propertyValues
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    PropertyValues postProcessPropertyValues(PropertyValues propertyValues, Object bean, String beanName) throws BeansException;
}
