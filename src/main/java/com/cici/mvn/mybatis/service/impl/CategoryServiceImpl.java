package com.cici.mvn.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cici.mvn.mybatis.dao.CategoryMapper;
import com.cici.mvn.mybatis.domain.Category;
import com.cici.mvn.mybatis.service.ICategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements ICategoryService {
	@Resource
	private CategoryMapper categoryDao;

	public Category loadById(String cid) {
		// TODO Auto-generated method stub
		return this.categoryDao.selectByPrimaryKey(cid);
	}

}
