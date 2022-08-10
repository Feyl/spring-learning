package com.feyl.spring.test;

import com.feyl.spring.context.support.ClassPathXmlApplicationContext;
import com.feyl.spring.test.bean.IUserService;
import org.junit.Test;

/**
 * @author Feyl
 */
public class ApiTest {

    @Test
    public void test_scan() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IUserService userService = applicationContext.getBean("userService", IUserService.class);
        System.out.println("测试结果：" + userService.queryUserInfo());
    }
}
