package com.feyl.spring.aop;

/**
 * A {@link TargetSource} is used to obtain the current "target" of
 * an AOP invocation, which will be invoked via reflection if no around
 * advice chooses to end the interceptor chain itself.
 *
 * 被代理的目标对象
 *
 * @author Feyl
 */
public class TargetSource {

    private final Object target;

    public TargetSource(Object target) {
        this.target = target;
    }

    /**
     * 返回此 {@link TargetSource} 返回的目标类型。
     * 可以返回 <code>null</code>，尽管 {@link TargetSource} 的某些用法可能只适用于预定的目标类。
     * @return 此 {@link TargetSource} 返回的目标类型
     */
    public Class<?>[] getTargetClass(){
        return this.target.getClass().getInterfaces();
    }

    /**
     * 返回一个目标实例。 在 AOP 框架调用 AOP 方法调用的“目标”之前立即调用。
     * @return 包含连接点的目标对象
     * @throws Exception 如果无法解析目标对象
     */
    public Object getTarget(){
        return this.target;
    }
}
