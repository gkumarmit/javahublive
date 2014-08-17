/**
 * Copyright @2014 By JavaHubLive.com
 *
 * All rights reserved. The source code is proprietary of JavaHubLive.com. 
 * The source code may not be reproduced or modify to any persons or third party entities
 * without prior notice to JavaHubLive.com.
 *
 * Created on 17-Aug-2014
 *
 * Last edited by:      Ganesh Kumar
 *             on:      17-Aug-2014 : 4:38:35 pm
 *       Filename:      WriteLogTest.java
 * 
 */
package com.javahublive.logback;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ganesh Kumar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-config.xml")
public class WriteLogTest {

	@Test
	public void verifyLogger() {
	}

}
