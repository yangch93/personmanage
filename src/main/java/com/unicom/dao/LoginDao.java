package com.unicom.dao;
import com.unicom.entity.User;
import com.unicom.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

public class LoginDao {
    private SqlSession sqlSession;
    private User user;

    private SqlSession getSqlSession(){
        sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
        return sqlSession;
    }
    //验证是否得到某一条数据
    public  User  LoginById(String userAccount ){
        user = getSqlSession().selectOne("selectByUserAccout",userAccount);
        return  user;
    }
}
