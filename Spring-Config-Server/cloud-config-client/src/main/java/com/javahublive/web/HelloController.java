/**
 * Copyright @2018 By JavaHubLive.com
 *
 * All rights reserved. The source code is proprietary of JavaHubLive.com. 
 * The source code may not be reproduced or modify to any persons or third party entities
 * without prior notice to JavaHubLive.com.
 *
 * Created on 17-Aug-2014
 *
 * Last edited by:      Ganesh Kumar
 *             on:      26-Dec-2018 : 6:52:55 pm
 *       Filename:      HelloController.java
 * 
 */
package com.javahublive.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ganesh Kumar
 *
 */
@RestController
@RefreshScope
public class HelloController {
	
	@Value("${lucky-word-data}")
    private String inputString;
	
	@GetMapping("/")
	public String getDataFromConfigServer() {
		return "Using [" + inputString + "] from config server";
		
	}
}


