package com.feyl.spring.context;

import java.util.EventListener;

/**
 * Interface to be implemented by application event listeners.
 * Based on the standard <code>java.util.EventListener</code>
 * interface for the Observer design pattern.
 *
 * @author Feyl
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * 处理应用程序事件。
     *
     * @param event 要响应的事件
     */
    void onApplicationEvent(E event);
}
