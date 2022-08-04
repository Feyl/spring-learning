package com.feyl.spring.test;

import com.feyl.spring.beans.PropertyValue;
import com.feyl.spring.beans.PropertyValues;
import com.feyl.spring.beans.factory.config.BeanDefinition;
import com.feyl.spring.beans.factory.config.BeanReference;
import com.feyl.spring.beans.factory.support.DefaultListableBeanFactory;
import com.feyl.spring.test.bean.UserDao;
import com.feyl.spring.test.bean.UserService;
import org.junit.Test;

/**
 * @author Feyl
 */
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        //1. 初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));

        //3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        //4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
