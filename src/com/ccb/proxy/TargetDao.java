package com.ccb.proxy;

public class TargetDao implements Dao {
    @Override
    public void insert(){
        System.out.println("invocationHandler");
    }

    @Override
    public void save(){
        System.out.println("methodInteceptor");
    }

}
