package com.cici.mvn.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.cici.mvn.mybatis.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    int insertBatch(List<User> list);
    
    @Select("select id, user_name as username, password, age from user_t where id=#{id}")
    User loadById(int id);
}