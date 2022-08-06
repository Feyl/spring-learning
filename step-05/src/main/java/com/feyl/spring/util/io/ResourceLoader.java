package com.feyl.spring.util.io;

/**
 * @author Feyl
 */
public interface ResourceLoader {

    /**
     * 从类路径加载的 URL 前缀：“classpath:”
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
