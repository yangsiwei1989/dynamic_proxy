package com.ccb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class  LogPrintInvocationHandler implements InvocationHandler {
    private Object targetDao;
    public LogPrintInvocationHandler(Object targetDao ){
        this.targetDao = targetDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //扩展1
        System.out.println("method start time"+ DateUtil.dateTransfe(new Date()));
        Object result = method.invoke(targetDao);
        System.out.println("method end time"+  DateUtil.dateTransfe(new Date()));
        return result;
    }



}
