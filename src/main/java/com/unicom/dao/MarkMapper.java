package com.unicom.dao;

import com.unicom.entity.Mark;

public interface MarkMapper {
    int deleteByPrimaryKey(Integer markId);

    int insert(Mark record);

    int insertSelective(Mark record);

    Mark selectByPrimaryKey(Integer markId);

    int updateByPrimaryKeySelective(Mark record);

    int updateByPrimaryKeyWithBLOBs(Mark record);

    int updateByPrimaryKey(Mark record);
}