/**
 * 
 */
package com.demo.postgres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.postgres.dao.UserDao;
import com.demo.postgres.model.User;

/**
 * @author Mehul
 *
  */

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	/**
	 * @param user
	 */
	public void saveUser(User user) {
		userDao.save(user);
	}
	
}
