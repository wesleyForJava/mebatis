package com.wesley.mebatis;

import java.lang.reflect.Proxy;
import java.util.ResourceBundle;

public class WConfiguration {

    public static final ResourceBundle sqlMappings;
    static {
        sqlMappings=ResourceBundle.getBundle("mebatis");
    }

    /**
     * 返回接口代理类的对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz,WSqlSession sqlSession) {
        return (T)Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{clazz},new WMapperProxy(sqlSession));
    }


}
