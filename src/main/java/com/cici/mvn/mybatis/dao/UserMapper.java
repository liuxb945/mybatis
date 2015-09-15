package com.cici.mvn.mybatis.dao;

import java.util.List;

import com.cici.mvn.mybatis.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int insertBatch(List<User> list);
}