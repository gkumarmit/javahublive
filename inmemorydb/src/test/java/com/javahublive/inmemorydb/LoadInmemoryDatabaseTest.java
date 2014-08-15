/**
 * Copyright @2014 By JavaHubLive.com
 *
 * All rights reserved. The source code is proprietary of JavaHubLive.com. 
 * The source code may not be reproduced or modify to any persons or third party entities
 * without prior notice to JavaHubLive.com.
 *
 * Created on 17-Aug-2014
 *
 * Last edited by:      ganesh
 *             on:      17-Aug-2014 : 12:04:38 am
 *       Filename:      LoadInmemoryDatabaseTest.java
 * 
 */
package com.javahublive.inmemorydb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ganesh
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-inmemorydb-config.xml")
public class LoadInmemoryDatabaseTest {

	@Test
	public void test() {
		System.out.println("Load Inmeory database");
	}

}
