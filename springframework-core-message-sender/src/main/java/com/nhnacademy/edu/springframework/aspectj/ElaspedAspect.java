//package com.nhnacademy.edu.springframework.aspectj;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StopWatch;
//
//
//@Aspect
//@Component
//public class ElaspedAspect {
//
//
//@Pointcut("execution(* com.nhnacademy.edu.springframework.greeting.service.Greeter.sayHello()")
//    public void targetGreeter(){}
//
//    @Around("targetGreeter()")
//    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws  Throwable{
//
//        StopWatch
//
//    }
//
//
//}
//
//
//
////public  interface Greeter{
//
//    boolean sayHello();
//}