package com.alex.spring.boot.dubbo.starter;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.ProxyFactory;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * @author Alex
 **/
public class HystrixProxy implements ProxyFactory {

    UserMangerMock userMangerMock=new UserMangerMock();
    public <T> T getProxy(Invoker<T> invoker) throws RpcException {
        System.out.println("i am getProxy");
        return null;
    }

    public <T> Invoker<T> getInvoker(T t, Class<T> aClass, URL url) throws RpcException {
        System.out.println("i am getInvoker");
        return null;
    }
}
