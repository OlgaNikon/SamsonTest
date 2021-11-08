package main.java.task01;

import java.lang.reflect.Proxy;

public class MethodInterception {

    public MainPage createPage(Class clazz) {
        return (MainPage) Proxy.newProxyInstance(SomeInvocationHandler.class.getClassLoader(), new Class[]{clazz}, new SomeInvocationHandler());
    }

}
