package com.unicom.dao;

import com.unicom.entity.UserType;
import com.unicom.entity.UserTypeKey;

public interface UserTypeMapper {
    int deleteByPrimaryKey(UserTypeKey key);

    int insert(UserType record);

    int insertSelective(UserType record);

    UserType selectByPrimaryKey(UserTypeKey key);

    int updateByPrimaryKeySelective(UserType record);

    int updateByPrimaryKey(UserType record);
}