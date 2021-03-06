package com.cici.mvn.mybatis.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cici.mvn.mybatis.dao.NaviMapper;
import com.cici.mvn.mybatis.domain.Navi;
import com.cici.mvn.mybatis.domain.NaviExample;
import com.cici.mvn.mybatis.domain.NaviExample.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
public class TestMapper {
	private static Logger log = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private NaviMapper naviMapper;
	
	@Test
	public void testSearch(){
		NaviExample ne=new NaviExample();
		Criteria criteria=ne.createCriteria();
		Criteria criteria2=ne.createCriteria();
//		NaviExample.Criterion criterion=new NaviExample.Criterion();
		//1
		criteria.andAppNameIsNotNull();
		List<String> names=new ArrayList<String>();
		names.add("频道");
		names.add("首页");
		criteria.andNaviNameIn(names);
		ne.or().andAppNameEqualTo("a");
		//2
		criteria2.andNaviIdBetween(1, 2);
		ne.or(criteria2);
		List<Navi> list=naviMapper.selectByExample(ne);
		log.warn(list.size());
	}

}
