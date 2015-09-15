package com.cici.mvn.mybatis.service.impl;

import java.util.List;

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

	public int add(User user) {
		// TODO Auto-generated method stub
		return this.userDao.insert(user);
	}

	public int update(User user) {
		// TODO Auto-generated method stub
		return this.userDao.updateByPrimaryKey(user);
	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		return this.userDao.deleteByPrimaryKey(id);
	}

	public int addBatch(List<User> users) {
		// TODO Auto-generated method stub
		return this.userDao.insertBatch(users);
	}
}
