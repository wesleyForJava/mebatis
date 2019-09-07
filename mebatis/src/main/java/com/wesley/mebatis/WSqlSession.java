package com.wesley.mebatis;

public class WSqlSession {

    //配置类
    private WConfiguration wConfiguration;

    //执行器
    private WExcutor wExcutor;


    public WSqlSession(WConfiguration wConfiguration, WExcutor wExcutor) {
        this.wConfiguration = wConfiguration;
        this.wExcutor = wExcutor;
    }

    /**
     * 调用excutor执行单条查询
     * @param statementId
     * @param parmeter
     * @param <T>
     * @return
     */
    public <T> T   selectOne(String statementId,Object parmeter){
        String sql=wConfiguration.sqlMappings.getString(statementId);
        return wExcutor.query(sql, parmeter);
    };

    /**
     * 获取一个代理对象
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class clazz){
        return wConfiguration.getMapper(clazz,this);
    }

}
