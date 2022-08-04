package com.feyl.spring.beans;

/**
 * 定义 Bean 异常
 *
 * @author Feyl
 */
public class BeansException extends RuntimeException{

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
