package com.feyl.spring.context;

import com.feyl.spring.beans.BeansException;

/**
 * SPI interface to be implemented by most if not all application contexts.
 * Provides facilities to configure an application context in addition to
 * the application context client methods in the {@link ApplicationContext} interface.
 *
 * @author Feyl
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     */
    void refresh() throws BeansException;

    void registerShutdownHook();

    void close();
}
