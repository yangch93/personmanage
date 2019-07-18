package com.unicom.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    private static String RESOURCE = "mybatis-config.xml";
    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    public static void initSqlSessionFactory(){
        try {
            InputStream is = Resources.getResourceAsStream(RESOURCE);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //在类外部获取SqlSessionFactory对象的方法
    public static SqlSessionFactory getSqlSessionFactory(){
        initSqlSessionFactory();
        return sqlSessionFactory;
    }

    public static void close(){
        SqlSession sqlSession = threadLocal.get();
        if (sqlSession != null){
            sqlSession.close();
            threadLocal.set(null);
        }
    }

}
