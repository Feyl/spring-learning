package com.feyl.spring.test.event;

import com.feyl.spring.context.ApplicationListener;
import com.feyl.spring.context.event.ContextRefreshedEvent;

/**
 * @author Feyl
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("刷新事件：" + this.getClass().getName());
    }
}
