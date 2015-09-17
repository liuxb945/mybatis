package com.cici.mvn.mybatis.service;

import com.cici.mvn.mybatis.domain.Category;

public interface ICategoryService {
	Category loadById(String cid);

}
