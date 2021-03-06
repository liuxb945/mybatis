package com.cici.mvn.mybatis.test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;  

import org.apache.log4j.Logger;  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
  




import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.alibaba.fastjson.JSON;  
import com.cici.mvn.mybatis.domain.Category;
import com.cici.mvn.mybatis.domain.User;
import com.cici.mvn.mybatis.service.ICategoryService;
import com.cici.mvn.mybatis.service.IUserService;
  
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMyBatis {  
    private static Logger logger = Logger.getLogger(TestMyBatis.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;
    
    @Resource  
    private ICategoryService catService = null;
    
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
         System.out.println(user.getUserName()); 
         System.out.println(user.getPassword());
        // logger.info("值："+user.getUserName());
    }
    
    @Test  
    public void load() {  
        User user = userService.loadById(1);  
         System.out.println(user.getUserName()); 
         System.out.println(user.getPassword());
        // logger.info("值："+user.getUserName());
    }
    
    @Test  
    public void loadCat() {  
        Category cat=this.catService.loadById("BIRDS");
        System.out.println(cat.getProducts().size());
        // logger.info("值："+user.getUserName());
    }
    
    @Test  
    public void loadAll() {  
        List<User> users = userService.selectAll();
        for(User user:users){
         System.out.println(user.getUserName()); 
         System.out.println(user.getPassword());
        }
        // logger.info("值："+user.getUserName());
    }
    
    @Test
    public void add(){
    	User user=new User();
    	user.setUserName("abc");
    	user.setPassword("11");
    	user.setAge(17);
    	userService.add(user);
    	System.out.println(user.getId());
    }
    
    @Test
    public void addBatch(){
    	List<User> users=new ArrayList<User>();
    	for(int i=0;i<5;i++){
	    	User user=new User();
	    	user.setUserName("abc"+i);
	    	user.setPassword("11");
	    	user.setAge(17);
	    	users.add(user);
    	}
    	userService.addBatch(users);
    	//System.out.println(user.getId());
    }
    @Test
    public void addTrans() throws Exception{
    	List<User> users=new ArrayList<User>();
    	for(int i=0;i<5;i++){
	    	User user=new User();
	    	user.setUserName("abc"+i);
	    	user.setPassword("11");
	    	user.setAge(17);
	    	users.add(user);
    	}
    	userService.addTrans(users);
    }
    
    @Test
    public void addTransAnn() throws Exception{
    	List<User> users=new ArrayList<User>();
    	for(int i=0;i<5;i++){
	    	User user=new User();
	    	user.setUserName("abc"+i);
	    	user.setPassword("11");
	    	user.setAge(17);
	    	users.add(user);
    	}
    	userService.addTransAnn(users);
    }
    
    @Test
    public void addTransXml() throws Exception{
    	List<User> users=new ArrayList<User>();
    	for(int i=0;i<5;i++){
	    	User user=new User();
	    	user.setUserName("abc"+i);
	    	user.setPassword("11");
	    	user.setAge(17);
	    	users.add(user);
    	}
    	userService.addTransXml(users);
    }
    
    @Test
    public void delete(){
    	userService.delete(3);
    }
    
    @Test
    public void update(){
    	User user = userService.getUserById(2);
    	user.setAge(18);
    	userService.update(user);
    }
    
    @Test
    public void testSelectByIds(){
    	String ids="1,2,3,4";
    	List<User> list=userService.selectByIds(ids);
    	System.out.println(list.size());
    }
    
    @Test
    public void testSelectByIdsTwo(){
    	List<Integer> ids=new ArrayList<Integer>();
    	for(int i=1;i<=8;i++){
    		ids.add(i);
    	}
    	List<User> list=userService.selectByIdsTwo(ids);
    	System.out.println(list.size());
    }
}
