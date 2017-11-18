package aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAop {

    @Pointcut("execution(* aoptest.User.doSomething(..))")
    public void pointcut(){}

    @Before("pointcut()")
    public void before(JoinPoint joinPoint) {
        System.out.println("before");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("after");
    }
//@Around 会使 @Before失效
//    @Around("pointcut()")
//    public void around(JoinPoint joinPoint) {
//        System.out.println("around");
//    }

}
