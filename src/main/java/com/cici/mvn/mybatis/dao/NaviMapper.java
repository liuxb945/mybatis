package com.cici.mvn.mybatis.dao;

import com.cici.mvn.mybatis.domain.Navi;
import com.cici.mvn.mybatis.domain.NaviExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NaviMapper {
    int countByExample(NaviExample example);

    int deleteByExample(NaviExample example);

    int deleteByPrimaryKey(Integer naviId);

    int insert(Navi record);

    int insertSelective(Navi record);

    List<Navi> selectByExample(NaviExample example);

    Navi selectByPrimaryKey(Integer naviId);

    int updateByExampleSelective(@Param("record") Navi record, @Param("example") NaviExample example);

    int updateByExample(@Param("record") Navi record, @Param("example") NaviExample example);

    int updateByPrimaryKeySelective(Navi record);

    int updateByPrimaryKey(Navi record);
}