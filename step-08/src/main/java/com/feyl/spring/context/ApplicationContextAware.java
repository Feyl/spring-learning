package com.feyl.spring.context;

import com.feyl.spring.beans.BeansException;
import com.feyl.spring.beans.factory.Aware;

/**
 * @author Feyl
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
