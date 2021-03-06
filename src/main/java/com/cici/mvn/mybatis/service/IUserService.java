package com.cici.mvn.mybatis.service;

import java.util.List;

import com.cici.mvn.mybatis.domain.User;

public interface IUserService {  
    public User getUserById(int userId);
    public int add(User user);
    public int update(User user);
    public int delete(int id);
    public int addBatch(List<User> users);
    public void addTrans(List<User> users) throws Exception;
    public void addTransAnn(List<User> users) throws Exception;
    public void addTransXml(List<User> users) throws Exception;
    public User loadById(int id);
    public List<User> selectAll();
    List<User> selectByIds(String ids);
    List<User> selectByIdsTwo(List<Integer> ids);
}
