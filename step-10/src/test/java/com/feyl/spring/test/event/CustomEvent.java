package com.feyl.spring.test.event;

import com.feyl.spring.context.event.ApplicationContextEvent;

/**
 * @author Feyl
 */
public class CustomEvent extends ApplicationContextEvent {

    private Long id;
    private String message;

    /**
     * 构造一个原型事件。
     *
     * @param source 事件源对象
     * @throws IllegalArgumentException 如果 source 是 null.
     */
    public CustomEvent(Object source, Long id, String message) {
        super(source);
        this.id = id;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

