package com.unicom.dao;

import com.unicom.entity.Talent;
import com.unicom.entity.TalentKey;

public interface TalentMapper {
    int deleteByPrimaryKey(TalentKey key);

    int insert(Talent record);

    int insertSelective(Talent record);

    Talent selectByPrimaryKey(TalentKey key);

    int updateByPrimaryKeySelective(Talent record);

    int updateByPrimaryKey(Talent record);
}