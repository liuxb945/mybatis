package com.cici.mvn.mybatis.dao;

import com.cici.mvn.mybatis.domain.Product;

public interface ProductMapper {
    int deleteByPrimaryKey(String productid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}