package com.feyl.spring.context.event;

import com.feyl.spring.beans.factory.BeanFactory;
import com.feyl.spring.context.ApplicationEvent;
import com.feyl.spring.context.ApplicationListener;

/**
 * Simple implementation of the {@link ApplicationEventMulticaster} interface.
 *
 * @author Feyl
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
