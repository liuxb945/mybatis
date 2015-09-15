package com.cici.mvn.mybatis.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.cici.mvn.mybatis.dao.UserMapper;
import com.cici.mvn.mybatis.domain.User;
import com.cici.mvn.mybatis.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private UserMapper userDao;
    @Resource
    private DataSourceTransactionManager txManager;
      
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
	
	public void addTrans(List<User> users) throws Exception{
    	DefaultTransactionDefinition def = new DefaultTransactionDefinition();
    	def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

    	TransactionStatus status = txManager.getTransaction(def);
    	try {
    		
        	for(int i=0;i<users.size();i++){
    	    	if(i<2){
    	    		this.userDao.insert(users.get(i));
    	    	}
    	    	else{
    	    		//throw new Exception("kkkk");
    	    	}
        	}
    	}
    	catch (Exception ex) {
    	  txManager.rollback(status);
    	  throw ex;
    	}
    	txManager.commit(status);
    }
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public void addTransAnn(List<User> users) throws Exception {
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++){
	    	if(i<2){
	    		this.userDao.insert(users.get(i));
	    	}
	    	else{
	    		throw new Exception("kkkk");
	    	}
    	}
	}
}
