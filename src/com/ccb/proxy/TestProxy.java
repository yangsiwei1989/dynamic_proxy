package com.ccb.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        Dao dao = new TargetDao();

        InvocationHandler handler = new LogPrintInvocationHandler(dao);

        Dao proxyObject = (Dao)Proxy.newProxyInstance(
                dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                handler);
        proxyObject.save();
    }
}
