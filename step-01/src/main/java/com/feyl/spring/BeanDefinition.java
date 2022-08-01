package com.feyl.spring;

/**
 * 用于定义 Bean 实例化信息，现在的实现是以一个 Object 存放对象。
 *
 * @author Feyl
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
