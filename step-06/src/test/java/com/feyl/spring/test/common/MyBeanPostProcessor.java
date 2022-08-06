package com.feyl.spring.test.common;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.factory.config.BeanPostProcessor;
import com.feyl.spring.test.bean.UserService;

/**
 * @author Feyl
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}

