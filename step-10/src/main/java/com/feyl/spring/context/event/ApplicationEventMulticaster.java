package com.feyl.spring.context.event;

import com.feyl.spring.context.ApplicationEvent;
import com.feyl.spring.context.ApplicationListener;

/**
 * Interface to be implemented by objects that can manage a number of
 * {@link ApplicationListener} objects, and publish events to them.
 *
 * @author Feyl
 */
public interface ApplicationEventMulticaster {

    /**
     * 添加一个侦听器以接收所有事件的通知。
     * @param listener 要添加的侦听器
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * 从通知列表中删除一个侦听器。
     * @param listener 要删除的侦听器
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * 将给定的应用程序事件多播到适当的侦听器。
     * @param event 多播的事件
     */
    void multicastEvent(ApplicationEvent event);
}
