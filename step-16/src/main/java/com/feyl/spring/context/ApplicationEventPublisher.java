package com.feyl.spring.context;

/**
 * Interface that encapsulates event publication functionality.
 * Serves as super-interface for ApplicationContext.
 *
 * 事件发布者接口
 *
 * @author Feyl
 */
public interface ApplicationEventPublisher {

    /**
     * 通知所有使用此应用程序注册的侦听器应用程序事件。
     * 事件可以是框架事件（例如 RequestHandledEvent）或特定于应用程序的事件。
     *
     * @param event 要发布的事件
     */
    void publishEvent(ApplicationEvent event);
}
