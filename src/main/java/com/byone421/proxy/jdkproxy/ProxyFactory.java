package com.byone421.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory{

    private TrainStation trainStation = new TrainStation();


    public TrainStation getProxy(){
      return (TrainStation) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代售点收取一定的服务费用(jdk动态代理)");
                Object invoke = method.invoke(proxy, args);
                return invoke;
            }
        });
    }
}
