package com.feyl.spring.context;

import com.feyl.spring.beans.factory.ListableBeanFactory;

/**
 * Central interface to provide configuration for an application.
 * This is read-only while the application is running, but may be
 * reloaded if the implementation supports this.
 *
 * 应用上下文
 *
 * @author Feyl
 */
public interface ApplicationContext extends ListableBeanFactory {
}
