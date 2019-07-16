package com.unicom.dao;

import com.unicom.entity.User;
import com.unicom.entity.UserWithBLOBs;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(UserWithBLOBs record);

    int insertSelective(UserWithBLOBs record);

    UserWithBLOBs selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    int updateByPrimaryKey(User record);
}