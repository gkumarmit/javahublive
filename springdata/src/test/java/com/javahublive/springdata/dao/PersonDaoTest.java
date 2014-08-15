/**
 * Copyright @2014 By JavaHubLive.com
 *
 * All rights reserved. The source code is proprietary of JavaHubLive.com. 
 * The source code may not be reproduced or modify to any persons or third party entities
 * without prior notice to JavaHubLive.com.
 *
 * Created on 15-Aug-2014
 *
 * Last edited by:      $Author: $
 *             on:      $Date: $
 *       Filename:      $Id: $
 * 
 */

package com.javahublive.springdata.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.javahublive.springdata.domain.Person;

/**
 * @author ganesh
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-data-jpa-config.xml")
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class PersonDaoTest {
	
	@Autowired
	private PersonDao persondDao;

	@Test
	public void insertPersonData() {
		Person person = new Person();
		person.setFirstName("Ganesh");
		person.setLastName("Kumar");
		person.setAddress("Delhi");
		persondDao.save(person);
		List<Person> personList = (List<Person>) persondDao.findAll();
		for(Person personObject:personList){
			System.out.println(personObject.getFirstName());
		}
	}

}
