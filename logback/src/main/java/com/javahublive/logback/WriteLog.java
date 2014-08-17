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
 *             on:      17-Aug-2014 : 4:31:47 pm
 *       Filename:      WriteLog.java
 * 
 */
package com.javahublive.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author Ganesh Kumar
 *
 */
@Component
public class WriteLog {
	
	private static final Logger logger = LoggerFactory.getLogger(WriteLog.class);
	
	public WriteLog(){
		logger.info("Constructor call ");
	}

}
