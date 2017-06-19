import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/6/19 0019.
 */
public class BaseLoginAdvice implements MethodBeforeAdvice,MethodInterceptor,AfterReturningAdvice {
    /**
     *
     * @param methodInvocation 将要执行的目标方法
     */
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return null;
    }

    /**
     *
     * @param method 将要执行的目标对象方法
     * @param objects 方法的参数
     * @param o 目标对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {

    }

    /**
     *
     * @param o 目标对象返回值
     * @param method 目标方法
     * @param objects 方法参数
     * @param o1 目标对象
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {

    }
}
