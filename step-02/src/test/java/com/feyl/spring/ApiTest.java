package com.feyl.spring;

import com.feyl.spring.beans.UserService;
import com.feyl.spring.beans.factory.config.BeanDefinition;
import com.feyl.spring.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;

/**
 * @author Feyl
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
    userService_singleton.queryUserInfo();

    }
}
