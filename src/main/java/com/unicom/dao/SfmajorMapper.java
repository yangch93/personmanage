package com.unicom.dao;

import com.unicom.entity.Sfmajor;

public interface SfmajorMapper {
    int deleteByPrimaryKey(Integer sfmajorId);

    int insert(Sfmajor record);

    int insertSelective(Sfmajor record);

    Sfmajor selectByPrimaryKey(Integer sfmajorId);

    int updateByPrimaryKeySelective(Sfmajor record);

    int updateByPrimaryKey(Sfmajor record);
}