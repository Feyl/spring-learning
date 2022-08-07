package com.feyl.spring.util;

/**
 * @author Feyl
 */
public class ClassUtil {

    public static ClassLoader getDefaultClassLoader() {
        ClassLoader classLoader = null;
        try {
            classLoader = Thread.currentThread().getContextClassLoader();
        } catch (Throwable e) {
            // Cannot access thread context ClassLoader - falling back to system class loader.
        }
        if (classLoader == null) {
            // No thread context class loader -> use class loader of this class.
            classLoader = ClassUtil.class.getClassLoader();
        }
        return classLoader;
    }
}
