package com.gintong.common.phoenix.permission.mapper.gen;

import com.gintong.common.phoenix.permission.entity.ResShareLink;

public interface ResShareLinkMapper {
    int deleteByPrimaryKey(Long shareLinkId);

    int insert(ResShareLink record);

    int insertSelective(ResShareLink record);

    ResShareLink selectByPrimaryKey(Long shareLinkId);

    int updateByPrimaryKeySelective(ResShareLink record);

    int updateByPrimaryKey(ResShareLink record);
}