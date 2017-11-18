package aoptest;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void doSomething(){
        System.out.println("pointcut:doSomething");
    }
}
