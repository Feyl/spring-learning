package com.feyl.spring.context.event;


import com.feyl.spring.context.ApplicationContext;

/**
 * Event raised when an {@link ApplicationContext} gets closed.
 *
 * @author Feyl
 */
public class ContextClosedEvent extends ApplicationContextEvent{

    /**
     * 构造一个原型事件。
     * @param source 最初发生事件的对象。
     * @throws IllegalArgumentException 如果 source 是 null.
     */
    public ContextClosedEvent(Object source) {
        super(source);
    }
}
