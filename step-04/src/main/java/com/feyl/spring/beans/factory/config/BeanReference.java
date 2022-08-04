package com.feyl.spring.beans.factory.config;

/**
 * Bean 的引用
 *
 * @author Feyl
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
