package com.gintong.common.phoenix.permission.mapper.gen;

import com.gintong.common.phoenix.permission.entity.ResJoin;

public interface ResJoinMapper {
    int deleteByPrimaryKey(Long resJoinId);

    int insert(ResJoin record);

    int insertSelective(ResJoin record);

    ResJoin selectByPrimaryKey(Long resJoinId);

    int updateByPrimaryKeySelective(ResJoin record);

    int updateByPrimaryKey(ResJoin record);
}