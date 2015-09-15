package com.cici.mvn.mybatis.service;

import com.cici.mvn.mybatis.domain.User;

public interface IUserService {  
    public User getUserById(int userId);
    public void add(User user);
    public void update(User user);
    public void delete()
}
