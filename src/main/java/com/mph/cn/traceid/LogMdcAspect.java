//package com.mph.cn.traceid;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Pointcut;
//import org.slf4j.MDC;
//
//import java.util.UUID;

///**
//
// * @title 为异步方法添加traceId
//
//
// * @createDate 2019-4-16
//
// */
//
//public class LogMdcAspect {
//    private static final String UNIQUE_ID = "traceId";
//
//    @Pointcut("@annotation(org.springframework.scheduling.annotation.Async)")
//    public void logPointCut() {
//    }
//
//    @Around("logPointCut()")
//    public Object around(ProceedingJoinPoint point) throws Throwable {
//        MDC.put(UNIQUE_ID, UUID.randomUUID().toString().replace("-", ""));
//        Object result = point.proceed();// 执行方法
//          MDC.remove(UNIQUE_ID);
//          return result;    }
//
//
//    }
