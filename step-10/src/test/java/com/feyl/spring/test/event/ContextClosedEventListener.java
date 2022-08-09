package com.feyl.spring.test.event;

import com.feyl.spring.context.ApplicationListener;
import com.feyl.spring.context.event.ContextClosedEvent;

/**
 * @author Feyl
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("关闭事件：" + this.getClass().getName());
    }
}
