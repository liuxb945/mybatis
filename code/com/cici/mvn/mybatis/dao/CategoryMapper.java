package com.cici.mvn.mybatis.dao;

import com.cici.mvn.mybatis.domain.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(String catid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(String catid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}