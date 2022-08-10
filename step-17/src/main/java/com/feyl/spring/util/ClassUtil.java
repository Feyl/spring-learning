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

    /**
     * 检查指定的类是否是CGLIB生成的类。
     * @param clazz 要检查的类
     */
    public static boolean isCglibProxyClass(Class<?> clazz) {
        return (clazz != null && isCglibProxyClassName(clazz.getName()));
    }

    /**
     * 检查指定的类名是否为CGLIB生成的类。
     * @param className 要检查的类名
     */
    public static boolean isCglibProxyClassName(String className) {
        return (className != null && className.contains("$$"));
    }
}
