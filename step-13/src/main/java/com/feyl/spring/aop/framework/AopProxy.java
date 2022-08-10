package com.feyl.spring.aop.framework;

/**
 * Delegate interface for a configured AOP proxy,
 * allowing for the creation of actual proxy objects.
 *
 * Out-of-the-box implementations are available for JDK dynamic proxies
 * and for CGLIB proxies, as applied by DefaultAopProxyFactory
 *
 * AOP 代理的抽象
 *
 * @author Feyl
 */
public interface AopProxy {

    Object getProxy();
}
