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

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javahublive.springdata.domain.Person;

/**
 * @author ganesh
 *
 */
@Repository
@Transactional
public interface PersonDao extends CrudRepository<Person,Long> {

}
