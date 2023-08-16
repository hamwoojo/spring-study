package spring.springstudy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceAop {
    @Around("execution(* spring.springstudy..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start =System.currentTimeMillis();
        System.out.println("START: " + joinPoint.toString());
        Object proceed = joinPoint.proceed();
        try{
            return joinPoint.proceed();
        } finally {
            long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");
        }


    }
}
