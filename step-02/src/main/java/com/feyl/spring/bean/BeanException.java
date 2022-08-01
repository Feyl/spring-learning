package com.feyl.spring.bean;

/**
 * 定义 Bean 异常
 *
 * @author Feyl
 */
public class BeanException extends RuntimeException{

    public BeanException(String message) {
        super(message);
    }

    public BeanException(String message, Throwable cause) {
        super(message, cause);
    }
}
