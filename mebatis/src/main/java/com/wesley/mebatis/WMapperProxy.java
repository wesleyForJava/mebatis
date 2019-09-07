package com.wesley.mebatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理对象
 */
public class WMapperProxy implements InvocationHandler {

    private WSqlSession sqlSession;

    public WMapperProxy(WSqlSession wSqlSession) {
        this.sqlSession=wSqlSession;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String stateMentId=method.getDeclaringClass().getName()+"."+method.getName();


        return sqlSession.selectOne(stateMentId,args[0]);
    }
}
