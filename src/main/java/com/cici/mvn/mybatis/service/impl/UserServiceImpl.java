package com.cici.mvn.mybatis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cici.mvn.mybatis.dao.UserMapper;
import com.cici.mvn.mybatis.domain.User;
import com.cici.mvn.mybatis.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;  
      
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);
    }

	public void add(User user) {
		// TODO Auto-generated method stub
		this.userDao.insert(user);
	}

	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}
}
