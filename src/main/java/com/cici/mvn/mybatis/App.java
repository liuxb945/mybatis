package com.cici.mvn.mybatis;

import java.util.ArrayList;
import java.util.List;

import com.cici.mvn.mybatis.dao.PersonDAO;
import com.cici.mvn.mybatis.vo.Person;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){

	    // Laod spring-config.xml file
	    //ApplicationContext ctx = new ClassPathXmlApplicationContext("com/hmkcode/config/spring-config.xml");

	    //get jdbcTemplatePersonDAO
	    PersonDAO personDAO = new PersonDAO(MyBatisConnectionFactory.getSqlSessionFactory());

	    //create person bean to insert
	    Person person = new Person();
	    person.setName("Person 1");

	    //( 1 ) insert person 
	    //personDAO.insert(person);

	    //**set name of person
	    person.setName("Person 2");	
	    //** insert another person
	    //int id = personDAO.insert(person);

	    //( 2 ) select persons by id
	    //personDAO.selectById(id);

	    //( 3 ) select all
	    //List<Person> persons = personDAO.selectAll();

	    //**set name of all persons
	    /*
	    for(int i = 0; i < persons.size(); i++){
	      persons.get(i).setName("Person Name "+i);
	      //( 4 ) update person
	      personDAO.update(persons.get(i));
	    }
	    */
	    List<Person> persons=new ArrayList<Person>();
	    for(int i=0;i<5;i++){
	    	Person p=new Person();
	    	p.setName("p "+i);
	    	persons.add(p);
	    }
	    personDAO.insertBatch(persons);

	    //**check update
	    persons = personDAO.selectAll();

	  }
}
