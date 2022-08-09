package com.feyl.spring.context.event;

import com.feyl.spring.context.ApplicationContext;
import com.feyl.spring.context.ApplicationEvent;

/**
 * Base class for events raised for an {@link ApplicationContext}.
 *
 * @author Feyl
 */
public class ApplicationContextEvent extends ApplicationEvent {

    /**
     * 构造一个原型事件。
     * @param source 最初发生事件的对象。
     * @throws IllegalArgumentException 如果 source 是 null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * 获取引发事件的 ApplicationContext。
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
